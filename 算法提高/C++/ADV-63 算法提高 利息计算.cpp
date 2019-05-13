#include <iostream>
using namespace std;
int main() {
    double m, r;
    cin >> m >> r;
    printf("%.2f", m + 0.8 * 0.01 * m * r);
    return 0;
}