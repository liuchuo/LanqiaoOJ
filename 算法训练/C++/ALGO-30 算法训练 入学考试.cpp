#include <iostream>
#define max(a, b) (a) > (b) ? (a) : (b)
using namespace std;
int dp[101][1001];
int main() {
	int t, m;
	cin >> t >> m;
	for(int i = 1; i <= m; i++) {
		int a, b;
		cin >> a >> b;
		for(int j = 1; j <= t; j++) {
			if(j >= a)
				dp[i][j] = max(dp[i-1][j], dp[i-1][j-a] + b);
			else
				dp[i][j] = dp[i-1][j];
		}
	}
	cout << dp[m][t];
	return 0;
}