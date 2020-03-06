#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int n;
    double sal, sum;
    cin >> n >> sal;
    sum = min(40, n) * sal + min(10, max(0, n - 40)) * sal * 1.5 + max(0, n - 50) * sal * 2;
    printf("%.2f",sum);
    return 0;
}