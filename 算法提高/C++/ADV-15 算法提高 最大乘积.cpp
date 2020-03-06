#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int cnt;
    cin >> cnt;
    for(int i = 0; i < cnt; i++) {
        int n, m;
        cin >> n >> m;
        int *a = new int [n];
        int ans = 1;
        for(int j = 0; j < n; j++) {
            cin >> a[j];
        }
        sort(a, a+n);
        int p = 0, q = n - 1;
        while(p <= n-1 && q >= 0 && m > 0) {
            if((a[p] * a[p+1] > a[q] * a[q-1]) && m >= 2) {
                ans = ans * (a[p] * a[p+1]);
                p += 2;
                m -= 2;
            } else {
                ans = ans * (a[q]);
                q--;
                m--;
            }
        }
        cout << ans << endl;
    }
    return 0;
}