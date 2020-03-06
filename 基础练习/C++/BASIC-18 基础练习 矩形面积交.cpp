#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;
int main() {
    double x1, y1, x2, y2, x3, y3, x4, y4;
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    if(x1 > x2)
        swap(x1, x2);
    if(y1 > y2)
        swap(y1, y2);
    if(x3 > x4)
        swap(x3, x4);
    if(y3 > y4)
        swap(y3, y4);
    if((x2 < x3 && x1 < x3) || (y2 < y3 && y1 < y3) || (x4 < x1 && x3 > x1) || (y4 < y1 && y3 < y1)) {
        cout << "0.00";
        return 0;
    }
    double a[4] = {x1, x2, x3, x4};
    double b[4] = {y1, y2, y3, y4};
    sort(a, a+4);
    sort(b, b+4);
    double area = (a[2] - a[1]) * (b[2] - b[1]);
    printf("%.2f", area);
    return 0;
}

