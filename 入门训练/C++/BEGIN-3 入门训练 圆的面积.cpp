#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int r;
    cin >> r;
    double s;
    double PI = atan(1.0) * 4;
    s =  PI * r * r;
    printf("%.7lf",s);
    return 0;
}
