#include <iostream>
#include <cstdio>
using namespace std;
int main() {
    double sale, rate;
    cin >> sale >> rate;
    double tax = sale * rate;
    printf("%.2f", tax);
    return 0;
}