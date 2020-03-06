#include <iostream>
using namespace std;
const int N = 1000001;
int main() {
    int F[N];
    F[1] = F[2] = 1;
    for (int i = 3; i <= 1000000; i++) {
        F[i] = (F[i - 1] + F[i - 2]) % 10007;
    }
    int n;
    cin >> n;
    cout << F[n];
    return 0;
}