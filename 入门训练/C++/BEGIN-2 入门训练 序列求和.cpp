#include <iostream>
int main() {
    using namespace std;
    long long n;
    cin >> n;
    long long result;
    result = (1 + n) * n / 2;
    printf("%I64d", result);
    return 0;
}