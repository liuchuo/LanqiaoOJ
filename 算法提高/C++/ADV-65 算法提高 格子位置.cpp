#include <iostream>
using namespace std;
int main() {
    int n, x, y, i, j;
    cin >> n >> x >> y;
    for (i = 1; i <= n; i++)
        printf("(%d,%d)", x, i);
    printf("\n");
    for (i = 1; i <= n; i++)
        printf("(%d,%d)", i, y);
    printf("\n");
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i - x == j - y)
                printf("(%d,%d)", i, j);
        }
    }
    printf("\n");
    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= n; j++) {
            if (i - x == -1 * (j - y))
                printf("(%d,%d)", i, j);
        }
    }
    return 0;
}