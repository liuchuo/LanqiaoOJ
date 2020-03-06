#include <iostream>
#include <algorithm>
using namespace std;
int cmp1(int a, int b) {return a > b;}
int cmp2(int a, int b) {return a < b;}
int main() {
    int a[4];
    string s;
    cin >> s;
    for(int i = 0; i < 4; i++) {
        a[i] = s[i] - '0';
    }
    int res = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
    int cnt = 0;
    while(res != 6174) {
        cnt++;
        sort(a, a+4, cmp1);
        int big = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
        sort(a, a+4, cmp2);
        int small = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
        res = big - small;
        a[0] = res / 1000;
        a[1] = res / 100 - res / 1000 * 10;
        a[2] = res / 10 - res / 100 * 10;
        a[3] = res % 10;
    }
    cout << cnt;
    return 0;
}