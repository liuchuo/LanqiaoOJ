#include <iostream>
using namespace std;
int main() {
    int n, m, ans[150][150], cnt = 0;
    char a[150][150];
    while (cin >> n >> m) {
        fill(a[0], a[0] + 150 * 150, '.');
        fill(ans[0], ans[0] + 150 * 150, -1);
        if (n == 0 && m == 0) break;
        printf("Field #%d:\n", ++cnt);
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                scanf(" %c ", &a[i][j]);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == '.') {
                    int sum = 0;
                    if (a[i][j + 1] == '*') sum++;
                    if (a[i][j - 1] == '*') sum++;
                    if (a[i + 1][j] == '*') sum++;
                    if (a[i - 1][j] == '*') sum++;
                    if (a[i + 1][j + 1] == '*') sum++;
                    if (a[i + 1][j - 1] == '*') sum++;
                    if (a[i - 1][j + 1] == '*') sum++;
                    if (a[i - 1][j - 1] == '*') sum++;
                    a[i][j] = sum + '0';
                }
                cout << a[i][j];
            }
            cout << endl;
        }
        cout << endl;
    }
    return 0;
}