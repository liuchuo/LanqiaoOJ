#include <iostream>
#include <cmath>
using namespace std;
double a, b, c;
double f(double x) {
    return a * x * x + b * x + c;
}
double find(double x, double y) {
    if (y - x < 0.000001) return x;
    double mid = (x + y) / 2;
    if (f(mid) == 0) return mid;
    else if (f(mid) * f(x) > 0) return find(mid, y);
    else return find(x, mid);
}
int main() {
    cin >> a >> b >> c;
    double mid = -1 * b / (2 * a);
    double ans1 = find(-9999999, mid);
    double ans2 = find(mid, 99999999);
    if (abs(ans1 - 0) < 0.0001) ans1 = 0;
    if (abs(ans2 - 0) < 0.0001) ans2 = 0;
    printf("%.2f %.2f", ans2, ans1);
    return 0;
}