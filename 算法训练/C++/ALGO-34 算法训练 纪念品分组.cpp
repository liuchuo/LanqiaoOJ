#include <iostream>
#include <algorithm>
#include <cstdio>
using namespace std;
int main() {
	int w, n;
	scanf("%d %d", &w, &n);
	int *a = new int[n];
	for(int i = 0; i < n; i++)
		scanf("%d", &a[i]);
	sort(a, a+n);
	int i = 0, j = n-1, cnt = 0;
	while(i <= j) {
		if(a[i] + a[j] <= w) {
			i++;
		}
		cnt++;
		j--;
	}
	cout << cnt;
	return 0;
}



