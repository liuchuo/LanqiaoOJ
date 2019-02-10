#include <iostream>
using namespace std;
long long p(long long a, long long b, long long m) {
    if (b == 0) return 1;
    if (b % 2 == 1) return p(a, b - 1, m) * (a % m) % m;
    long long t = p(a, b / 2, m);
    return t * t % m;
}
int main() {
    long long a, b, m;
    cin >> a >> b>> m;
    cout << p(a, b, m);
    return 0;
}