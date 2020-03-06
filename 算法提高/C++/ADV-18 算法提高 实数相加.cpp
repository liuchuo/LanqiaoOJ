#include <iostream>
#include <string>
using namespace std;
string add1(string s1, string s2) {
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
string add2(string s1, string s2) {
    int len1 = s1.length(), len2 = s2.length();
    if (len1 < len2) {
        string t(len2 - len1, '0');
        s1 = s1 + t;
    } else if (len2 < len1) {
        string t(len1 - len2, '0');
        s2 = s2 + t;
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
    while (cin >> a >> b) {
        string a1, a2, b1, b2;
        int i, j;
        for (i = 0; i < a.length() && a[i] != '.'; i++);
        for (j = 0; j < b.length() && b[j] != '.'; j++);
        a1 = a.substr(0, i);
        b1 = b.substr(0, j);

        if (i == a.length()) a2 = "";
        else a2 = a.substr(i + 1, a.length() - i - 1);
        if (j == b.length())b2 = "";
        else b2 = b.substr(j + 1, b.length() - j - 1);

        string ans1 = add1(a1, b1);
        string ans2 = add2(a2, b2);

        if (ans2.length() > max(a2.length(), b2.length())) {
            ans2 = ans2.substr(1, ans2.length() - 1);
            ans1 = add1(ans1, "1");
        }
        if (ans2.length() > 0) ans2 = "." + ans2;
        cout << ans1 << ans2 << endl;
    }
    return 0;
}