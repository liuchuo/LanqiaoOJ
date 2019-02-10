#include <iostream>
using namespace std;
int main() {
    int n, a[1000];
    cin >> n;
    for (int i = n; i >= 0; i--) {
        cin >> a[i];
        if (a[i] != 0) {
            if (i != 0) {
                if (i != n && a[i] > 0) cout << "+";
                if (a[i] == -1) cout << "-";
                else if (a[i] != 1) cout << a[i];
                cout << "x";
                if (i != 1) cout << "^" << i;
            } else {
                if (a[i] > 0) cout << "+";
                cout << a[i];
            }
        }
    }
    return 0;
}