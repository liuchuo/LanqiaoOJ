#include <iostream>
#include <vector>
using namespace std;
struct blan {
    int a, b, x, y;
};
int main() {
    int n, a, b, x, y, xx, yy;
    cin >> n;
    vector<blan> v(n);
    for (int i = 0; i < n; i++)
        scanf("%d %d %d %d", &v[i].a, &v[i].b, &v[i].x, &v[i].y);
    scanf("%d %d", &xx, &yy);
    for (int i = v.size() - 1; i >= 0; i--) {
        if (xx >= v[i].a && xx <= v[i].a + v[i].x && yy >= v[i].b && yy <= v[i].b + v[i].y) {
            cout << i + 1;
            return 0;
        }
    }
    cout << -1;
    return 0;
}