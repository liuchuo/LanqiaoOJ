#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    double s = (a + b + c) / 2.0;
    printf("%.2f", sqrt(s * (s - a) * (s - b) * (s - c)));
    return 0;
}