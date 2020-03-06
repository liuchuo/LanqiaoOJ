#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int A[10000] = {1};
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j < 10000; j++) {
            A[j] = A[j] * i;
        }
        for (int j = 0; j < 10000; j++) {
            if (A[j] >= 9) {
                A[j + 1] =A[j + 1] + A[j] / 10;
                A[j] = A[j] % 10;
            }
        }
    }
    int t = 0;
    for (int i = 9999; i >= 0; i--) {
        if (A[i] != 0) {
            t = i;
            break;
        }
    }
    for (int i = t; i >= 0; i--) {
        cout << A[i];
    }
    return 0;
}