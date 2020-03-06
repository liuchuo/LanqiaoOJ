#include <iostream>
using namespace std;
int main() {
    int a[20];
    int count;
    for (int i = 0; i < 20; i++) {
        cin >> a[i];
        if (a[i] == 0) {
            count = i;
            break;
        }
    }
    for (int i = count - 1; i >= 0 ; i--)
        cout << a[i] << " ";
    return 0;
}