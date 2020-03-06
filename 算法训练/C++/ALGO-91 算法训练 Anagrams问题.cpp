#include <iostream>
#include <string>
#include <cctype>
using namespace std;
int main() {
    int a[26] = {0};
    int b[26] = {0};
    int flag = 1;
    string m, n;
    cin >> m;
    cin >> n;
    int lenm = m.length();
    int lenn = n.length();
    if (lenm != lenn) {
        cout << 'N';
        return 0;
    }
    for (int i = 0; i < lenm; i++) {
        m[i] = toupper(m[i]);
        n[i] = toupper(n[i]);
    }
    for (int i = 0; i < lenm; i++) {
        a[m[i] - 'A']++;
        b[n[i] - 'A']++;
    }
    for (int i = 0; i < 26; i++) {
        if (a[i] != b[i])
            flag = 0;
    }
    if (flag == 0)
        cout << 'N';
    else
        cout << 'Y';
    return 0;
}