#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int t;
    if (a < b) {
        swap(a, b);
    }
    if (a < c) {
        swap(a, c);
    }
    if (b < c) {
        swap(b, c);
    }
    cout << a << " " << b << " " << c;
    return 0;
}