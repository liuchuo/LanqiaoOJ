#include <iostream>
#include <vector>
using namespace std;
vector<int> v, ans;
int n, k, cnt;
void dfs(int num, int sum) {
    if (num == -1) {
        if (sum == k && ans.size() > 0) {
            for (int i = ans.size() - 1; i >= 0; i--) {
                if (i != 0) {
                    printf("%d ", ans[i]);
                } else {
                    printf("%d\n", ans[i]);
                }
            }
            cnt++;
        }
    } else {
        dfs(num - 1, sum);
        ans.push_back(v[num]);
        dfs(num - 1, sum + v[num]);
        ans.pop_back();
    }
}
int main() {
    scanf("%d", &n);
    v.resize(n);
    for (int i = 0; i < n; i++)
        scanf("%d", &v[i]);
    scanf("%d", &k);
    dfs(n - 1, 0);
    printf("%d\n", cnt);
    return 0;
}