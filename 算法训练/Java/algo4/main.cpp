#include <cstdio>
#include <vector>

using namespace std;

struct edge {
    int toNode, nextEdge;
};

vector<vector<int> > v;
int dp[100000][2];

void dfs(int root, int pre) {
    for (int i = 0; i < v[root].size(); i++) {
        if (v[root][i] != pre) {
            dfs(v[root][i], root);
            dp[root][0] += max(dp[v[root][i]][0], dp[v[root][i]][1]);
            dp[root][1] += dp[v[root][i]][0];
        }
    }
}

int main() {
    int n = 0, a = 0, b = 0;
    scanf("%d", &n);
    v.resize(n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &dp[i][1]);
    }
    for (int i = 0; i < n - 1; i++) {
        scanf("%d %d", &a, &b);
        v[a - 1].push_back(b - 1);
        v[b - 1].push_back(a - 1);
    }
    dfs(0, -1);
    printf("%d", max(dp[0][0], dp[0][1]));
    return 0;
}
