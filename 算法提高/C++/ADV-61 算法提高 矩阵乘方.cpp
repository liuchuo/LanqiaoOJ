#include <iostream>
#include <vector>
using namespace std;
int m;
vector<int> mul(vector<int> a, vector<int> b) {
    vector<int> ans(5);
    ans[1] = (a[1] * b[1] + a[2] * b[3]) % m;
    ans[2] = (a[1] * b[2] + a[2] * b[4]) % m;
    ans[3] = (a[3] * b[1] + a[4] * b[3]) % m;
    ans[4] = (a[3] * b[2] + a[4] * b[4]) % m;
    return ans;
}
vector<int> f(vector<int> v, int b) {
    vector<int> minn(5), nulln(5);
    minn[1] = minn[4] = 1;
    if (b == 0) {
        return mul(nulln, minn);
    } else if (b == 1) {
        return mul(v, minn);
    } else if (b % 2 == 0) {
        vector<int> t(5);
        t = f(v, b / 2);
        return mul(t, t);
    } else {
        return mul(f(v, b - 1), v);
    }
}
int main() {
    vector<int> v(5), ans;
    int b;
    cin >> b >> m;
    cin >> v[1] >> v[2] >> v[3] >> v[4];
    ans = f(v, b);
    printf("%d %d\n%d %d\n", ans[1], ans[2], ans[3], ans[4]);
    return 0;
}