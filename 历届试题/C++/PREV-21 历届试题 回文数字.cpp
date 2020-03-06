#include <iostream>
using namespace std;
int main() {
    int n;
    int flag = 0;
    cin >> n;
    for (int i1 = 1; i1 <= 9; i1++)
        for (int i2 = 0; i2 <= 9; i2++)
            for (int i3 = 0; i3 <= 9; i3++) {
                if ((i1 + i2 + i3 + i2 + i1) == n) {
                    flag = 1;
                    cout << i1 << i2 << i3 << i2 << i1 << endl;
                }
            }
    for (int i1 = 1; i1 <= 9; i1++)
        for (int i2 = 0; i2 <= 9; i2++)
            for (int i3 = 0; i3 <= 9; i3++) {
                if ((i1 + i2 + i3 + i3 + i2 + i1) == n) {
                    flag = 1;
                    cout << i1 << i2 << i3 << i3 << i2 << i1 << endl;
                }
            }
    if (flag == 0)
        cout << -1;
    return 0;
}