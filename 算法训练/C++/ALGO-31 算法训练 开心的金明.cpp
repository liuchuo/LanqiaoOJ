#include <iostream>
#define max(a, b) (a) > (b) ? (a) : (b)
using namespace std;
int dp[25][30000];
int main() {
    int n, m;
    cin >> n >> m;
    for(int i = 1; i <= m; i++) {
        int a, b;
        cin >> a >> b;
        for(int j = 1; j <= n; j++) {
            if(j >= a)
                dp[i][j] = max(dp[i-1][j], dp[i-1][j-a] + a * b);
            else
                dp[i][j] = dp[i-1][j];
        }
    }
    cout << dp[m][n];
    return 0;
}



