#include <iostream>
#include <cmath>
using namespace std;
int main() {
    int n, cold, t, ll = 0, lr = 0, rl = 0, rr = 0, ans = 0;
    cin >> n >> cold;
    for (int i = 0; i < n - 1; i++) {
        cin >> t;
        if (t > 0) {
            if (abs(t) < abs(cold)) lr++;
            else rr++;
        } else {
            if (abs(t) < abs(cold)) ll++;
            else rl++;
        }
    }
    if (cold < 0) {
        if (lr > 0) ans = lr + rl + 1;
        else ans = 1;

    } else {
        if (rl > 0) ans = rl + lr + 1;
        else ans = 1;

    }
    cout << ans;
    return 0;
}