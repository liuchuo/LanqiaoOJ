#include <iostream>
#include <algorithm>
using namespace std;
int cmp(int a, int b) {
    return a < b;
}
int main() {
    int n, q;
    cin >> n >> q;
    int *a = new int [n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    for (int i = 0; i < q; i++) {
        int low, high;
        cin >> low >> high;
        int *b = new int [high - low + 1];
        int temp = low;
        for (int j = 0; j < high - low + 1; j++)
            b[j] = a[temp++];
        sort(b, b + high - low + 1, cmp);
        cout << b[0] << endl;
        delete [] b;
    }
    delete [] a;
    return 0;
}