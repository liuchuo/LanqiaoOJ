#include <iostream>
#include <vector>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    vector<vector<int> > t(n, vector<int>(m));
    for (int i = 0; i < m; i++) {
        int a, b;
        cin >> a >> b;
        t[a - 1][i] = 1;
        t[b - 1][i] = -1;
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << t[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}	