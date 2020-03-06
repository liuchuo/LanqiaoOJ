#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int n, a[100005] = {0}, sum = 0, maxn = 0;
    scanf("%d", &n);
    for (int i = 0; i <= n; i++) {
        scanf("%d", &a[i]);
        if (sum + a[i] >= 0) sum = sum + a[i];
        else sum = 0;
        maxn = max(maxn, sum);
    }
    cout << maxn;
    return 0;
}