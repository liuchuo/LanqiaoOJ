#include <iostream>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    int *a = new int[n];
    for(int i = 0; i < n; i++)
        cin >> a[i];
    for(int i = 0; i < m; i++) {
        int p, q;
        cin >> p >> q;
        swap(a[p-1], a[q-1]);
    }
    for(int i = 0; i < n; i++)
        cout << a[i] << endl;
    delete [] a;
    return 0;
}