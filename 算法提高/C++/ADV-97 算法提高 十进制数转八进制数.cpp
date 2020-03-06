#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    if (n == 0)
        return 0;
    int b[30];
    int i = 0;
    while (n != 0) {
        b[i++] = n % 8;
        n = n / 8;
    }
    for (int j = i - 1; j >=0; j--) {
        cout << b[j];
    }
    return 0;
}