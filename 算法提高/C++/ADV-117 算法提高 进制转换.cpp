#include <iostream>
using namespace std;
int main() {
    int n = 0;
    char c1, c2, c3;
    string s(3, '0'), ans8;
    scanf("%c %c %c", &c1, &c2, &c3);
    s[0] = c1;
    s[1] = c2;
    s[2] = c3;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] >= '0' && s[i] <= '9') n = n * 16 + s[i] - '0';
        else n = n * 16 + s[i] - 'A' + 10;
    }
    if (s[0] == '0') s = s.substr(1, s.length() - 1);
    if (s[0] == '0') s = s.substr(1, s.length() - 1);
    cout << s << " " << n << " ";
    while (n) {
        ans8 = char(n % 8 + '0') + ans8;
        n /= 8;
    }
    if (ans8 == "") ans8 = "0";
    cout << ans8;
    return 0;
}