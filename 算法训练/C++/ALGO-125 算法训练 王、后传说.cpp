#include <iostream>
#include <cmath>
#include <vector>
using namespace std;
int n, x, y;
int cnt = 0;

bool issafe(vector<int> &pos, int row) {
	if((pos[row] == y-1 || pos[row] == y || pos[row] == y+1) && (row == x-1 || row == x || row == x+1))
		return false;
	for(int i = 0; i < row; i++) {
		if(pos[i] == pos[row] || abs(pos[i] - pos[row]) == abs(i - row)) {
			return false;
		}
	}
	return true;
}

void dfs(vector<int> &pos, int row) {
	if(row == n) {
		cnt++;
		return ;
	}
	for(pos[row] = 0; pos[row] < n; pos[row]++) {
		if(issafe(pos, row)) {
			dfs(pos, row + 1);
		}
	}
}

int main(){
	cin >> n >> x >> y;
	vector<int> pos(n);
	dfs(pos, 0);
	cout << cnt;
	return 0;
}