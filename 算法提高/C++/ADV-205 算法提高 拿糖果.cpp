#include <iostream>
#include <cmath>
using namespace std;
int prime[50000];
int dp[100005];
int book[100005];
int cnt = 0;

void create() {
	int len = sqrt(100005);
    for(int i = 2; i <= len; i++) {
        if(book[i] == 0) {
            prime[cnt++] = i;
            for(int j = i * i; j <= len; j = j + i)
                book[j] = 1;
        }
    }
}

int main() {
    create();
    int n;
    cin >> n;
    for(int i = 1; i <= n; i++) {
        for(int j = 0; j < cnt; j++) {
            if(prime[j] > sqrt(i))
                break;
            if(i % prime[j] == 0)
                dp[i] = max(dp[i], dp[i-2*prime[j]] + prime[j]);
        }
    }
    cout << dp[n];
    return 0;
}