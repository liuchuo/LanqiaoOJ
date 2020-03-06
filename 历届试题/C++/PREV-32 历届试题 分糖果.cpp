#include <iostream>
using namespace std;
int a[150], ahalf[150], n, cnt = 0;
bool check() {
    bool flag = true;
    for (int i = 1; i < n; i++)
        if (a[i] != a[i + 1]) flag = false;
    for (int i = 1; i <= n; i++) {
        if (a[i] % 2 == 1) {
            a[i]++;
            cnt++;
        }
    }
    return flag;
}
int main() {
    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    do {
        for (int i = 1; i <= n; i++)
            ahalf[i] = a[i] / 2;
        for (int i = 1; i < n; i++)
            a[i] = ahalf[i] + ahalf[i + 1];
        a[n] = ahalf[n] + ahalf[1];
    } while (!check());
    cout << cnt;
    return 0;
}