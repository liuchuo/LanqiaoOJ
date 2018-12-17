
#include <iostream>
using namespace std;
int main() {
    int k, n;
    cin >> k;
    for (int i = 0; i < k; i++) {
        cin >> n;
        int s = n % 60;
        int m = (n / 60) % 60;
        int h = n / (60 * 60);
        printf("%02d:%02d:%02d\n", h, m, s);
    }
    return 0;
}