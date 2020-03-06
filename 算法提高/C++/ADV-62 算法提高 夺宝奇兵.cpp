#include <iostream>
using namespace std;
#define max(a, b) a > b ? a : b
int main() {
	int n;
	cin >> n;
	int a[101][101];
	for(int i = 0; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			cin >> a[i][j];
		}
	}
	int ans = 0;
	for(int i = 1; i < n; i++) {
		for(int j = 0; j <= i; j++) {
			if(j == 0)
				a[i][j] += a[i-1][j];
			else if(j == i)
				a[i][j] += a[i-1][j-1];
			else
				a[i][j] += max(a[i-1][j-1], a[i-1][j]);
		}
	}
	for(int i = 1; i < n; i++) {
		ans = ans > a[n-1][i] ? ans : a[n-1][i];
	}
	cout << ans;
	return 0;
}