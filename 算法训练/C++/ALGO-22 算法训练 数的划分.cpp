#include <iostream>
using namespace std;
int cnt = 0;

void dfs(int front, int n, int step) {
    if(step == 1) {
        cnt++;
        return ;
    }
    for(int i = front; i <= n / step; i++)
        dfs(i, n - i, step - 1);
}

int main() {
    int n, k;
    cin >> n >> k;
    dfs(1, n, k);
    cout << cnt;
    return 0;
}

