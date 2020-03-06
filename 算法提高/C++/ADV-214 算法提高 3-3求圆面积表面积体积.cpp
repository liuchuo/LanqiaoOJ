#include <iostream>
#define pi 3.1415926536
using namespace std;
int main() {
    double a, b, c;
    double r;
    cin >> r;
    a = pi * r * r;
    b = 4 * pi * r * r;
    c = 4.0 / 3 * pi * r * r * r;
    printf("%-20.10lf%-20.10lf%-20.10lf", a, b, c);
    return 0;
}