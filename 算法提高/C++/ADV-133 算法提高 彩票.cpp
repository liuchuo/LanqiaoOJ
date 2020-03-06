#include <iostream>
using namespace std;
int main() {
    int n, m[34] = {0}, a[10] = {0};
    cin >> n;
    for (int i = 0; i < 7; i++) {
        int t;
        cin >> t;
        m[t]++;
    }
    while (n--) {
        int mt[34] = {0}, sum = 0;
        for (int i = 0; i < 7; i++) {
            int t;
            cin >> t;
            mt[t]++;
        }
        for (int i = 1; i <= 33; i++) 
            sum += min(mt[i], m[i]);
        a[7 - sum]++;
    }
    for (int i = 0; i < 7; i++) {
        cout << a[i] << " ";
    }
    return 0;
}