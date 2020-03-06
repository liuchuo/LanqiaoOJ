#include <iostream>
#include <vector>
using namespace std;
int main() {
    int n, p[50001] = {0};
    cin >> n;
    vector<int> vp, ans;
    for (int i = 2; i <= 50000; i++) {
        if (p[i] == 0) {
            vp.push_back(i);
            for (int j = 1; j * i <= 50000; j++) {
                p[i * j] = -1;
            }
        }
    }
    for (int i = 0; i < vp.size(); i++) {
        int t = vp[i];
        while (n % t == 0) {
            ans.push_back(t);
            n /= t;
        }
    }
    if (n != 1) ans.push_back(n);
    for (int i = 0; i < ans.size(); i++) {
        if (i != 0) cout << '*';
        cout << ans[i];
    }
    return 0;
}