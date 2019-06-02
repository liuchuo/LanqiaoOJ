#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
vector<int> ansv;
pair<int, int> v[10];
int n, k, cnt, a[10];
void dfs(int num) {
    if (num == 0) {
        int white = 0, black = 0, ans = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] == -1) black++;
            if (a[i] == 1) white++;
        }
        for (int i = 1; i <= n; i++) {
            if (a[i] == 1 && (v[i].first != white-1 || v[i].second != black)) return;
            if (a[i] == -1 && (v[i].first == white && v[i].second == black-1)) return;
        }
        for (int i = 1; i <= n; i++) 
            if (a[i] == 1) ans = ans * 10 + i;
        ansv.push_back(ans);
    } else {
        a[num] = -1;
        dfs(num - 1);

        a[num] = 1;
        dfs(num - 1);
    }
}
int main() {
    scanf("%d", &n);;
    for (int i = 1; i <= n; i++)
        scanf("%d%d", &v[i].first, &v[i].second);
    dfs(n);
    sort(ansv.begin(), ansv.end());
    printf("%d\n", ansv[0]);
    return 0;
}