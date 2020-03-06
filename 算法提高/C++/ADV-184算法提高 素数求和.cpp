#include <iostream>
using namespace std;
int v[2000001];
int main() {
    int n;
    cin >> n;
    for(int i = 2; i * i <= n; i++) {
        if(v[i] == 1)
            continue;
        for(int j = i * i; j <= n; j = j + i)
                v[j] = 1;
    }
    long long int cnt = 0;
    for(int i = 2; i <= n ; i++) {
        if(v[i] == 0) {
            cnt += i;
        }
    }
    cout << cnt;
    return 0;
}