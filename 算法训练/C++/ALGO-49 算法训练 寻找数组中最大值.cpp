#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int *arr = new int [n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    int max = arr[0], t = 0;
    for (int i = 1; i < n; i++) {
        if (max < arr[i]) {
            max = arr[i];
            t = i;
        }
    }
    cout << max << " " << t;
    delete [] arr;
    return 0;
}
