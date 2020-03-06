#include <iostream>
using namespace std;
int ans = 0;
void f(int y, int m, int d) {
    if (m == 1 || m == 2) {
        y--;
        m += 12;
    }
    if ((d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7 == 4 && d == 13) ans++;
}
int main() {
    int n;
    int m31[] = {1, 3, 5, 7, 8, 10, 12};
    int m30[] = {4, 6, 9, 11};
    int m2;
    cin >> n;
    if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
        m2 = 29;
    } else {
        m2 = 28;
    }
    for (int i = 0; i < 7; i++)
        for (int j = 1; j <= 31; j++)
            f(n, m31[i], j);

    for (int i = 0; i < 4; i++)
        for (int j = 1; j <= 30; j++)
            f(n, m30[i], j);

    for (int j = 1; j <= m2; j++)
        f(n, 2, j);
    cout << ans << endl;
    return 0;
}