#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;
int main() {
    int n, r;
    scanf("%d %d", &n, &r);
    int *a = new int[n];
    for(int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sort(a, a+n);
    int ans = 0;
    int cnt = n / r;
    while(cnt--) {
        for(int j = 0; j < cnt * r; j++)
            ans += a[j];
    }
    for(int i = n/r*r; i < n; i++) {
        for(int j = i % r; j < n/r*r; j += r)
            ans += a[j];
    }
    cout << ans;
    delete [] a;
    return 0;
}