#include <iostream>
#include <algorithm>
#include <cstring>
int f(int i, int j);
int a[101][101];
int d[101][101];
int n;
using namespace std;
int main() {
    memset(d, -1, sizeof(d));
    cin >> n;
    for (int i = 1; i <= n; i++)
        for (int j = 1; j <= i; j++)
            cin >> a[i][j];
    cout << f(1, 1);
    return 0;
}

int f(int i, int j) {
    if (d[i][j] >= 0)
        return d[i][j];
    if (i == n)
        return a[i][j];
    else
        return d[i][j] = a[i][j] + max(f(i + 1, j), f(i + 1, j + 1));
}