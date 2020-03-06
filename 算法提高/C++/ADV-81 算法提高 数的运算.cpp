#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;
void func1(int *p) {
    cout << (*p)*(*p) << " ";
}

void func2(int *p) {
    printf("%.2lf ", sqrt(*p));
}

void func3(int *p) {
    printf("%.2lf", 1.0 / (*p));
}

int main() {
    int n;
    cin >> n;
    int *p = &n;
    func1(p);
    func2(p);
    func3(p);
    return 0;
}