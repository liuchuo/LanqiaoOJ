#include <iostream>
#include <cstdio>
using namespace std;
int main() {
    int k, n;
    double p;
    cin >> k >> n >> p;
    double ans = 0;
    for(int i = 0; i < n; i++) {
        ans = ans + k;
        ans = ans * (1 + p);
    }
    printf("%.2f", ans - n * k);
    return 0;
}