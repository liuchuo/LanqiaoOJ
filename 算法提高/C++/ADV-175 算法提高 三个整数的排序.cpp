#include <iostream>
using namespace std;
int main() {
    int a, b, c, t;
    cin >> a >> b >> c;
    if (a < b)
        swap(a, b);
    if (b < c)
        swap(b, c);
    if (a < b)
        swap(a, b);
    cout << a << " " << b << " " << c;
    return 0;
}
