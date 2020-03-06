#include <iostream>
#include <vector>
using namespace std;
int main() {
	int n;
	cin >> n;
	vector<int> v(n+1);
	v[0] = 1, v[1] = 1;
	for(int i = 2; i <= n; i++) {
		v[i] = v[i-1] + v[i-2];
	}
	cout << v[n];
	return 0;
}


#include <iostream>
using namespace std;
int cnt = 0;

void dfs(int n) {
    if(n == 1) {
        cnt++;
        return ;
    }
    if(n == 2) {
        cnt++;
        dfs(n - 1);
        return ;
    }
    dfs(n-1);
    dfs(n-2);
}
int main() {
    int n;
    cin >> n;
    dfs(n);
    cout << cnt;
    return 0;
}