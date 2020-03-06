#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int cnt = 0;
    while(n != 1) {
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                cout << i << " ";
                cnt++;
                n = n / i;
                break;
            }
        }
    }
    cout << endl << cnt;
    return 0;
}