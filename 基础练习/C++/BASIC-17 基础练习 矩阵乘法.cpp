#include <iostream>
using namespace std;
long long int b[40][40];
int main() {
    int n, m;
    cin >> n >> m;
    long long int a[40][40];
    long long int t[40][40];
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cin >> a[i][j];
            t[i][j] = a[i][j];
        }
    }
    if(m == 0) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    cout << 0 << " ";
                } else {
                    cout << 1 << " ";
                }
            }
            cout << endl;
        }
        return 0;
    }
    while(--m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int k = n;
                while(k) {
                    b[i][j] += t[i][k-1] * a[k-1][j];
                    k--;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                t[i][j] = b[i][j];
                b[i][j] = 0;
            }
        }
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cout << t[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}
