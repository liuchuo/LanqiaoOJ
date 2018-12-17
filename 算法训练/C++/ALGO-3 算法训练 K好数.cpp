#include<cstdio>
#include<algorithm>
using namespace std;
const int m = 1000000007;
int main(){
	int K, L;
	long long dp[105][105], res=0;
	scanf("%d%d", &K, &L);
	fill(dp[0],dp[0]+105*105, 0);
	for(int i=0;i<K;i++){
		dp[1][i] = 1;
	}
	
	for(int i=2;i<=L;i++){
		for(int j=0;j<K;j++){
			for(int h=0;h<K;h++){
				if(h!=j-1 && h!=j+1){
					dp[i][j] += dp[i-1][h];
					dp[i][j] %= m;
				}
			}
		}
	}
	for(int i=1;i<K;i++){
		res += dp[L][i];
	}
	printf("%I64d", res%m);
	return 0;
} 
