#include <iostream>
#include <cstdio>
using namespace std;
int main() {
    double a;
    cin >> a;
    double b = 0;
    int s[6] = {1000000, 600000, 400000, 200000, 100000, 0};
    double t[6] = {0.01, 0.015, 0.03, 0.05, 0.075, 0.1};
    for(int i = 0; i < 6; i++) {
        if(a - s[i] >= 0) {
            b += (a - s[i]) * t[i];
            a = s[i];
        }
    }
    printf("%.2f", b);
    return 0;
}