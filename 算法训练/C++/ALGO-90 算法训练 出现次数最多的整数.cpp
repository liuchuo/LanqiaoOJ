#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    if (n > 0) {
        int *a = new int [n];
        int b, count = 1, temp = 1;
        cin >> a[0];
        b = a[0];
        for(int i = 1; i < n; i++) {
            cin >> a[i];
            if (a[i] == a[i - 1]) {
                temp++;
                if (temp > count) {
                    count = temp;
                    b = a[i];
                }
            } else {
                temp = 1;
            }
        }
        cout << b;
        delete [] a;
    }
    return 0;
}
