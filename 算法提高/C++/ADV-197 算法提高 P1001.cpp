#include <iostream>
#include <string>
#include <cmath>
using namespace std;
int main() {
    string a, b;
    cin >> a >> b;
    int lena = a.length();
    int lenb = b.length();
    char d[20][20];
    char c[20];
    for (int i = 0; i <= 19; i++) {
        for (int j = 0; j <= 19; j++) {
            d[i][j] = '0';
        }
        c[i] = '0';
    }
    
    int temp = 0;
    int k = 0;
    int cou = 0;
    int t = 0;
    for (int i = lenb - 1; i >= 0; i--) {
        k = 0;
        for (int j = lena - 1; j >= 0; j--) {
            t = ((b[i] - '0') * (a[j] - '0'));
            temp = temp + t * pow(10, k++);
        }
        k = 0;
        while(temp != 0) {
            d[cou][k++] = (temp % 10) + '0';
            temp = temp / 10;
        }
        cou++;
    }
    
    for (int i = 0; i <= 18; i++) {
        for (int j = 0; j <= i; j++) {
            c[i] = (c[i] - '0' + d[j][i - j] - '0') % 10 + '0';
            temp = temp + (d[j][i - j] - '0');
        }
        temp = temp / 10;
        c[i + 1] = temp + '0';
    }
    
    int flag = 0;
    for (int i = 19; i >= 0; i--) {
        if (c[i] != '0') {
            flag = i;
            break;
        }
    }
    for (int i = flag; i >= 0; i--)
        cout << c[i];
    return 0;
}