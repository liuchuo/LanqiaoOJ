#include <iostream>
#include <algorithm>
#include <string>
#include <cctype>
using namespace std;
int main() {
    int p1, p2, p3;
    string s;
    cin >> p1 >> p2 >> p3 >> s;
    for (int i = 0; i < s.size(); i++) {
        cout << s[i];
        if (i < s.size() - 2 && s[i + 1] == '-' &&
            (isdigit(s[i]) && isdigit(s[i + 2]) || islower(s[i]) && islower(s[i + 2]))) {
            char c1 = s[i], c2 = s[i + 2];
            string ans;
            if (c1 >= c2) ans = "-";
            else if (c1 + 1 == c2) ans = "";
            else {
                if (p3 == 1) {
                    for (int i = c1 + 1; i < c2; i++) {
                        if (p1 == 1) ans.append(p2, tolower((char) i));
                        if (p1 == 2) ans.append(p2, toupper((char) i));
                        if (p1 == 3) ans.append(p2, '*');
                    }
                }
                if (p3 == 2) {
                    for (int i = c2 - 1; i > c1; i--) {
                        if (p1 == 1) ans.append(p2, tolower((char) i));
                        if (p1 == 2) ans.append(p2, toupper((char) i));
                        if (p1 == 3) ans.append(p2, '*');
                    }
                }
            }
            cout << ans;
            i++;
        }
    }
    return 0;
}