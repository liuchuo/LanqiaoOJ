#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int *a = new int [n+1];
    a[0] = 0;
    for(int i = 1; i <= n; i++) {
        a[i] = a[i-1] + i;
    }
    for(int i = 0; i <= n-2; i++) {
        for(int j = i+1; j <= n; j++) {
            if((a[j] - a[i]) == n) {
                cout << i+1 << " " << j << endl;
            } else if((a[j] - a[i]) > n) {
                break;
            }
        }
    }
    delete [] a;
    return 0;
}