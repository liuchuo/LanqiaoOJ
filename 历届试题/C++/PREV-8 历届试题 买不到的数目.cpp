#include <iostream>
#include <cmath>
#include <vector>
using namespace std;
int main() {
    int t, n = 0, dp[100001] = {0}, maxn = 100000;
    vector<int> w(1), v(1);
    while (cin >> t) {
        w.push_back(t);
        v.push_back(t);
        n++;
    }
    for (int i = 1; i <= n; i++) {
        for (int j = w[i]; j <= maxn; j++) {
            dp[j] = max(dp[j], dp[j - w[i]] + v[i]);
        }
    }
    dp[0] = -1;
    for (int i = maxn; i >= 0; i--) {
        if (dp[i] < i) {
            cout << i;
            return 0;
        }
    }
    return 0;
}