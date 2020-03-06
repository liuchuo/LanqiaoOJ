#include <iostream>
#include <string>
using namespace std;
int main() {
    string a, b;
    cin >> a >> b;
    int lena = a.length();
    int lenb = b.length();
    if (lena != lenb) {
        cout << 1;
        return 0;
    }
    int flag = 1;
    for (int i = 0; i < lena; i++) {
        if (a[i] != b[i]) {
            flag = 0;
            break;
        }
    }
    if (flag == 1) {
        cout << 2;
        return 0;
    }
    int flag2 = 1;
    for (int i = 0; i < lena; i++) {
        a[i] = tolower(a[i]);
        b[i] = tolower(b[i]);
        if (a[i] != b[i]) {
            flag2 = 0;
            break;
        }
    }
    if (flag2 == 1) {
        cout << 3;
    } else {
        cout << 4;
    }
    return 0;
}