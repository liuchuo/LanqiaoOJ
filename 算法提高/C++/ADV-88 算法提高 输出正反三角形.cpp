#include <iostream>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n - i; j++)
            cout << " ";
        for(int j = 1; j <= 2 * i - 1; j++)
            cout << "*";
        for(int j = 1; j <= m; j++)
            cout << " ";
        for(int j = 1; j <= 2 * (n - i + 1) - 1; j++)
            cout << "*";
        cout << endl;
    }
    return 0;
}