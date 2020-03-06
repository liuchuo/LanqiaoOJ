#include <iostream>
#include <algorithm>
using namespace std;

int cmp(int a, int b) {
    return a > b;
}
int main() {
    int a[20];
    int count = 0;
    for (int i = 0; i < 20; i++) {
        cin >> a[i];
        if (a[i] == 0) {
            count = i;
            break;
        }
    }
    sort(a, a + count,cmp);
    cout << a[1];
    return 0;
}