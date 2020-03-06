#include <iostream>
using namespace std;
#define PI 3.1415926
int main() {
    double r;
    cin >> r;
    printf("%.5f", 4 * r * r * r * PI / 3);
    return 0;
}