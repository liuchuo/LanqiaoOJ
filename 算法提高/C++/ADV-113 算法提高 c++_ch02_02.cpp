#include <iostream>
using namespace std;
int main() {
    int a, b, ans;
    char c;
    cin >> a >> b >> c;
    if (c == '+') ans = a + b;
    else if (c == '-') ans = a - b;
    else if (c == '*') ans = a * b;
    else if (c == '%') ans = a % b;
    else if (c == '/') ans = a / b;
    cout << ans;
    return 0;
}