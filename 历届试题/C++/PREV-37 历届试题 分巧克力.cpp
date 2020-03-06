#include <iostream>
#include <vector>
#include <utility>
using namespace std;
vector<pair<int, int> > v;
int n, k, l = 1, r = 99999999;
int check(int a) {
    int res = 0;
    for (int j = 0; j < n; j++) {
        res += (v[j].first / a) * (v[j].second / a);
        if (res >= k) break;
    }
    return res - k;
}
int main() {
    scanf("%d%d", &n, &k);
    v.resize(n);
    for (int i = 0; i < n; i++)
        scanf("%d%d", &v[i].first, &v[i].second);
    while (l <= r) {
        int mid = (r + l) / 2;
        if (check(mid) >= 0 && check(mid + 1) < 0) {
            cout << mid << endl;
            return 0;
        } else if (check(mid) < 0) {
            r = mid - 1;
        } else if (check(mid) >= 0) {
            l = mid + 1;
        }
    }
    return 0;
}