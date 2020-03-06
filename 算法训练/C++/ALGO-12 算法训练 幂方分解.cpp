#include <iostream>
#include <vector>
using namespace std;
string dfs(int n) {
    if (n == 1) return "1";
    if (n == 0) return "0";
    string ans;
    vector<int> v;
    int cnt = 0;
    while (n) {
        if (n % 2 == 1) v.push_back(cnt);
        n /= 2;
        cnt++;
    }
    for (int i = v.size() - 1; i >= 0; i--) {
        ans += "2(" + dfs(v[i]) + ")";
        if (i != 0) ans += "+";
    }
    return ans;
}
int main() {
    int n;
    cin >> n;
    string ans = dfs(n);
    for (int i = 0; i < ans.size(); i++) {
        if (ans[i + 1] == '1') i += 3;
        cout << ans[i];
    }
    return 0;
}