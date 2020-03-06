#include <iostream>
#include <cstring>
using namespace std;
void f(string s) {
    int a[11], sum = 0;
    memset(a, -1, sizeof(a));
    if (s[0] == '1') a[2] *= -1, a[4] *= -1;
    if (s[1] == '1') a[1] *= -1, a[3] *= -1, a[5] *= -1;
    if (s[2] == '1') a[2] *= -1, a[6] *= -1;
    if (s[3] == '1') a[1] *= -1, a[5] *= -1, a[7] *= -1;
    if (s[4] == '1') a[2] *= -1, a[4] *= -1, a[6] *= -1, a[8] *= -1;
    if (s[5] == '1') a[3] *= -1, a[5] *= -1, a[9] *= -1;
    if (s[6] == '1') a[4] *= -1, a[8] *= -1;
    if (s[7] == '1') a[5] *= -1, a[7] *= -1, a[9] *= -1;
    if (s[8] == '1') a[6] *= -1, a[8] *= -1;
    for (int i = 1; i <= 9; i++)
        if (a[i] == 1) sum++;
    if (sum == 4) cout << s << endl;
}
int main() {
    for (int i = 0; i < 512; i++) {
        int n = i;
        string s;
        while (n) {
            s = (char) (n % 2 + '0') + s;
            n /= 2;
        }
        string t(9 - s.length(), '0');
        s = t + s;
        f(s);
    }
    return 0;
}