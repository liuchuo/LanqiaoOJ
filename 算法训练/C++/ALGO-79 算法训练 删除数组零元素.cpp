#include <iostream>
using namespace std;
int CompactIntegers(int arr[],int n) {
    int count = n;
    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            count--;
        }
    }
    return count;
}
int main() {
    int n;
    cin >> n;
    int *a = new int [n];
    for (int i = 0; i < n; i++) {
        cin >> a[i];
        int temp = a[i];
    }
    cout << CompactIntegers(a, n) << endl;
    for (int i = 0; i < n; i++) {
        if (a[i] != 0)
            cout << a[i] << " ";
    }
    delete [] a;
    return 0;
}


