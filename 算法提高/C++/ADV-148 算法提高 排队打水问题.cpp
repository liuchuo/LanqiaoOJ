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
    int cnt = n/r;
    int index = 0;
    while(cnt--) {
        for(int j = 0; j < index; j++)
            ans += a[j];
        for(int i = 0; i < r; i++)
            ans += a[index++];
    }
    while(index < n) {
        int t = index % r;
        while(t < n) {
            ans += a[t];
            t += r;
        }
        index++;
    }
    cout << ans;
    delete [] a;
    return 0;
}