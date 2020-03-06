#include <iostream>
using namespace std;
int dfs(int n, int k) {
    if (k == 0 || k == n) return 1;
    return dfs(n-1, k) + dfs(n-1, k-1);
}
int main() {
    int k, n;
    cin >> k >> n;
    cout << dfs(n, k);
    return 0;
}