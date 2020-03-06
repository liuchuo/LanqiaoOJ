#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int *p = a;
    if(*p < b)
        p = &b;
    if(*p < c)
        p = &c;
    return 0;
}