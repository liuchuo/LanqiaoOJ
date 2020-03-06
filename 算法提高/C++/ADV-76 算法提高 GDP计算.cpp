#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;
int main() {
    int n;
    cin >> n;
    double ans = pow(1.1, n);
    printf("%.2lf", ans);
    return 0;
}