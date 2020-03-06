#include <iostream>
using namespace std;
int main() {
    int n, m, t, a[150][150];
    cin >> n >> m;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++) {
            cin >> a[i][j];

        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++) {
            cin >> t;
            a[i][j] += t;

        }
    }
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++) {
            if(j != m - 1) cout << a[i][j] << ' ';
            else cout << a[i][j] << endl;

        }
    }
    return 0;
}