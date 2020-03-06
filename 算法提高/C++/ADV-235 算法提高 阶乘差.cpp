#include <iostream>
using namespace std;
int n, m, p;
int f(int n){
    int ans = 1;
    for(int i = 1; i <= n; i++)
        ans = ans * i % p;
    return ans;
}
int main() {
    cin >> n >> m >> p;
    cout << (f(n)-f(m) + p) % p;
    return 0;
}