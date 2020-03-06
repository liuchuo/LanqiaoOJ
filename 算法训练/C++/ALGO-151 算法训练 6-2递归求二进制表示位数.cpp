#include <iostream>
using namespace std;
int dfs(int n, int cnt) {
    if (n == 0) return cnt;
    return dfs(n >> 1, cnt + 1);
}
int main() {
    int n;
    cin >> n;
    cout << dfs(n, 0);
    return 0;
}