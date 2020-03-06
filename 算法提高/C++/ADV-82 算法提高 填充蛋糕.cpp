#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;
int main() {
    double r;
    cin >> r;
    double ans = r * M_PI * r + 4 * M_PI * r;
    printf("%.1lf", ans);
    return 0;
}

或者用atan(1)*4代替：

#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;
int main() {
    double r;
    cin >> r;
    double ans = r * atan(1) * 4 * r + 16 * atan(1) * r;
    printf("%.1lf", ans);
    return 0;
}