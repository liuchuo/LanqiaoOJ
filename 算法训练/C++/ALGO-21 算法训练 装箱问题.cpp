#include <iostream>
using namespace std;
#define max(a, b) (a) > (b) ? (a) : (b)
int dp[31][20001];
int main() {
    int v, n;
    cin >> v >> n;
    for(int i = 1; i <= n; i++) {
        int t;
        cin >> t;
        for(int j = 1; j <= v; j++) {
            if (j >= t) {
                dp[i][j] = max(dp[i-1][j], dp[i-1][j-t] + t);
            } else {
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    cout << v - dp[n][v];
    return 0;
}