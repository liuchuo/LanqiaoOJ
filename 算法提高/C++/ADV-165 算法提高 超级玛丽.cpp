#include <iostream>
#include <vector>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    vector<int> v(n+1, -1);
    for(int i = 0; i < m; i++) {
        int temp;
        cin >> temp;
        v[temp] = 0;
    }
    v[1] = 1;
    v[2] = v[2] == 0 ? v[2] : 1;
    for(int i = 3; i <= n; i++) {
        if(v[i] != 0)
            v[i] = v[i-1] + v[i-2];
    }
    cout << v[n];
    return 0;
}