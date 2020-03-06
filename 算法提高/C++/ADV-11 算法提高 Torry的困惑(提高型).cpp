#include <iostream>
#define MOD 50000
using namespace std;
int v[2000000];
int main() {
    int n;
    cin >> n;
    for(int i = 2; i * i < 2000000; i++) {
        if(v[i] == 1)
            continue;
        for(int j = i * i; j < 2000000; j = j + i) {
            if(j % i == 0)
                v[j] = 1;
        }
    }
    long long int ans = 1;
    int cnt = 0;
    for(int i = 2; i < 2000000; i++) {
        if(v[i] == 0) {
            ans = (ans * i) % MOD;
            cnt++;
        }
        if(cnt == n)
            break;
    }
    cout << ans;
    return 0;
}