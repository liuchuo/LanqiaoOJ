#include <iostream>
int a[1000001], ans = 0;
using namespace std;
int find(int x) {
    while (x != a[x]) {
        x = a[x];
    }
    int t = x;
    while (t != a[t]) {
        int z = t;
        t = a[t];
        a[z] = x;
    }
    return x;
}
void uni(int x, int y) {
    a[find(x)] = find(y);
}
int main() {
    int m, n, k;
    scanf("%d%d%d", &m, &n, &k);
    for (int i = 0; i <= m * n; i++)
        a[i] = i;
    for (int i = 0; i < k; i++) {
        int t1, t2;
        scanf("%d%d", &t1, &t2);
        uni(t1, t2);
    }
    for (int i = 1; i <= m * n; i++)
        if (find(i) == i) ans++;
    cout << ans << endl;
    return 0;
}