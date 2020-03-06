#include <iostream>
#include <cstdio>
using namespace std;
struct node {
	int a;
	int b;
	double c;
};
int cmp1(node t1, node t2) {
	return t1.c > t2.c;
}
int main() {
	int n, w;
	node * arr = new int [n];
	for(int i = 0; i < n; i++) {
		cin >> arr[i].a >> arr[i].b;
		arr[i].c =arr[i].b *1.0 / arr[i].a; 
	}
	sort(arr, arr+n, cmp1);
	double ans = 0.0;
	int j = 0;
	while(w > 0) {
		if(arr[j].a < w) {
			w = w - arr[j].a;
			ans = ans + arr[j].b;
		} else {
			ans = ans + w * 1.0 / arr[j].a * arr[j].b; 
			w = 0;
		}
		j++;
	}
	printf("%.1f", ans);
	return 0;
}