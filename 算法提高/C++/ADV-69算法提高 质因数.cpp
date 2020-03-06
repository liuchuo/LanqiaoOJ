#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int i = 2; i <= n; i++) {
        if(i != n && n % i == 0) {
            cout << n << "=" << i;
        } else if(i == n) {
            cout << n "=" << 1 << "*" << i;
            return 0;
        }
    }
    while(n != 1) {
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                cout << "*" << i;
                n = n / i;
                break;
            }
        }
    }
    return 0;
}