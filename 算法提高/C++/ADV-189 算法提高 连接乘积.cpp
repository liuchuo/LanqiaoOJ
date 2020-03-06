#include <iostream>
using namespace std;
int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
int main() {
    int a, b, c, ans;
    cin >> a >> b >> c;
    ans = a * b / gcd(a, b);
    ans = ans * c / gcd(ans, c);
    cout << ans;
    return 0;
}