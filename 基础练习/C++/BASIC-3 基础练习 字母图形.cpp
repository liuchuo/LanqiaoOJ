#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cout << char('A' + abs(i - j));
        }
        cout << endl;
    }
    return 0;
}