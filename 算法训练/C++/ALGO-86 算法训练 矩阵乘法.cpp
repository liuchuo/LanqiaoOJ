#include <iostream>
#include <vector>
using namespace std;
int main() {
    int m, s, n;
    cin >> m >> s >> n;
    vector< vector<int> > a(m, vector<int>(s));
    vector< vector<int> > b(s, vector<int>(n));
    vector< vector<int> > c(m, vector<int>(n));
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < s; j++) {
            cin >> a[i][j];
        }
    }
    for (int i = 0; i < s; i++) {
        for (int j = 0; j < n; j++) {
            cin >> b[i][j];
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < s; k++) {
                c[i][j] = c[i][j] + a[i][k] * b[k][j];
            }
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++){
            cout << c[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}