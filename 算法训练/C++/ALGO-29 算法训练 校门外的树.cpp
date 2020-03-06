#include <iostream>
#include <vector>
using namespace std;
int main() {
	int l, m;
	cin >> l >> m;
	vector<int> v(l+1, 1);
	for(int i = 0; i < m; i++) {
		int a, b;
		cin >> a >> b;
		for(int j = a; j <= b; j++) {
			v[j] = 0;
		}
	}
	int cnt = 0;
	for(int i = 0; i < l+1; i++) {
		if(v[i] == 1)
			cnt++;
	}
	cout << cnt;
	return 0;
}