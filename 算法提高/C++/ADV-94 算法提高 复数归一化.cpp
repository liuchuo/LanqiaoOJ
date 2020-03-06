#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;
int main() {
    double a, b;
    double p, q;
    cin >> a >> b;
    p = a / sqrt(a * a + b * b);
    q = b / sqrt(a * a + b * b);
    cout << setprecision(1) << p;
    if(q > 0) {
        cout << "+";
        cout << setprecision(1) << q;
        cout.unsetf(ios_base::floatfield);
        cout << "i";
    } else if(q < 0) {
        cout << setprecision(1) << q;
        cout.unsetf(ios_base::floatfield);
        cout << "i";
    }
    return 0;
}