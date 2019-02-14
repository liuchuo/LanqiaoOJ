#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;
int main() {
    int a[10], ans = 1;
    for (int i = 1; i <= 9; i++)
        cin >> a[i];
    if (a[1] + a[2] + a[3] != 15) ans = 0;
    if (a[4] + a[5] + a[6] != 15) ans = 0;
    if (a[7] + a[8] + a[9] != 15) ans = 0;
    if (a[1] + a[4] + a[7] != 15) ans = 0;
    if (a[2] + a[5] + a[8] != 15) ans = 0;
    if (a[3] + a[6] + a[9] != 15) ans = 0;
    if (a[1] + a[5] + a[9] != 15) ans = 0;
    if (a[7] + a[5] + a[3] != 15) ans = 0;
    cout << ans;
    return 0;
}