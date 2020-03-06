#include <map>
#include <string>
using namespace std;
string add(string s1, string s2) {
    int len1 = s1.length(), len2 = s2.length();
    if (len1 < len2) {
        string t(len2 - len1, '0');
        s1 = t + s1;
    } else if (len2 < len1) {
        string t(len1 - len2, '0');
        s2 = t + s2;
    }
    string ans = s1;
    int car = 0;
    for (int i = s1.length() - 1; i >= 0; i--) {
        ans[i] = (s1[i] - '0' + s2[i] - '0' + car) % 10 + '0';
        car = (s1[i] - '0' + s2[i] - '0' + car) / 10;
    }
    if (car) ans = (char) (car + '0') + ans;
    return ans;
}
int main() {
    string a, b;
    cin >> a >> b;
    cout << add(a, b);
    return 0;
}