#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int cmp(int a, int b){return a > b;}
int main() {
    int n, m;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    cin >> m;
    vector<int> result(m);
    for (int i = 0; i < m; i++) {
        int l, r, k;
        cin >> l >> r >> k;
        int *temp = new int [n];
        for(int j = 0; j < n; j++) {
            temp[j] = a[j];
        }
        sort(temp + l - 1, temp + r, cmp);
        result[i] = temp[l - 1 + k - 1];
        delete [] temp;
    }
    for (int i = 0; i < m; i++) {
        cout << result[i] << endl;
    }
    return 0;
}
