#include <iostream>
#include <cstdio>
#define max(a, b) (a) > (b) ? (a) : (b)
using namespace std;
int main() {
	int n;
	scanf("%d", &n);
	int *dp = new int[n+1];
	int *from = new int[n+1];
	for(int i = 1; i <= n; i++) {
		scanf("%d", &from[i]);
	}
	dp[0] = 0;
	int maxvalue = 0;
	for(int i = 1; i <= n; i++) {
		dp[i] = dp[from[i]] + 1;
		maxvalue = max(maxvalue, dp[i]);
	}
	cout << maxvalue;
	delete [] dp;
	delete [] a;
}