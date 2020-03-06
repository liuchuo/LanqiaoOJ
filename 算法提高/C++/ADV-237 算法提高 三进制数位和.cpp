#include <iostream>
using namespace std;
bool isprime(int n) {
    if(n == 1 || n == 0) return false;
    for (int i = 2; i * i <= n; i++)
        if (n % i == 0) return false;
    return true;
}
int main() {
    int l, r, ans = 0;
    cin >> l >> r;
    for (int i = 0; i < 729; i++) {
        int sum = 0, j = i;
        while(j) {
            sum += j % 3;
            j /= 3;
        }
        if(isprime(sum) || (l <= sum && sum <= r))
            ans++;
    }
    cout << ans << endl;
    return 0;
}