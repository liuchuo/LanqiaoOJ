#include <iostream>
using namespace std;
int main() {
    int n, m;
    cin >> n >> m;
    int cnt = 0;
    for(int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        if(m + 30 >= temp)
            cnt++;
    }
    cout << cnt;
    return 0;
}