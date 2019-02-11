#include <iostream>
#include <cmath>
using namespace std;
#define PI 3.1415926
#define min 0.000001
double x;
double arccos(double l, double r) {
    if (r - l < min) return l;
    double mid = (l + r) / 2;
    if (cos(mid) == x) return mid;
    else if (cos(mid) > x) return arccos(mid, r);
    else return arccos(l, mid);
}
int main() {
    cin >> x;
    printf("%.5f", arccos(0, PI));
    return 0;
}