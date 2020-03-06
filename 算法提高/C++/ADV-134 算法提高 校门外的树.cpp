#include <iostream>
#include <cstdio>
int book[10001];
using namespace std;
int main() {
	int l, m;
	scanf("%d %d", &l, &m);
	for(int i = 0; i < m; i++) {
		int a, b;
		scanf("%d %d", &a, &b);
		for(int j = a; j <= b; j++)
			book[j] = 1;
	}
	int cnt = 0;
	for(int i = 0; i <= l; i++) {
		if(book[i] == 0)
			cnt++;
	}
	printf("%d", cnt);
	return 0;
}