#include <iostream>
using namespace std;
int main() {
    int a, b, c, d, e, f;
    cin >>a >>b >> c >> d >> e >> f;
    long long int x, y;
    y = (c * d - f * a) / (b * d - e * a);
    x = (c - b * y) / a;
    cout << x << " " << y;
    return 0;
}