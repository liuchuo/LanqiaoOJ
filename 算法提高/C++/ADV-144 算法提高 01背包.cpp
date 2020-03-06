#include <iostream>
using namespace std;
#define max(a, b) (a) > (b) ? (a) : (b)
int dp[201][5001];
int main() {
    int n, m;
    cin >> n >> m;
    for(int i = 1; i <= n; i++) {
        int w, v;
        cin >> w >> v;
        for(int j = 1; j <= m; j++) {
            if (j >= w)
                dp[i][j] = max(dp[i-1][j], dp[i-1][j-w] + v);
            else
                dp[i][j] = dp[i-1][j];
        }
    }
    cout << dp[n][m];
    return 0;
}