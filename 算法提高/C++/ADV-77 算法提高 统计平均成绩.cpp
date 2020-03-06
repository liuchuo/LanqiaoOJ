#include <iostream>
#include <cstdio>
using namespace std;
int main() {
    double c1 = 0.0, c2 = 0.0, c3 = 0.0, c4 = 0.0;
    double t1, t2, t3, t4;
    for(int i = 0; i < 4; i++) {
        cin >> t1 >> t2 >> t3 >> t4;
        c1 += t1;
        c2 += t2;
        c3 += t3;
        c4 += t4;
    }
    printf("%.2lf\n%.2lf\n%.2lf\n%.2lf", c1 / 4, c2 / 4, c3 / 4, c4 / 4);
    return 0;
}