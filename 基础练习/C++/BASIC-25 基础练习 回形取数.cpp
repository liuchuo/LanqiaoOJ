#include <iostream>
#include <memory.h>
using namespace std;
int main() {
    int m, n;
    cin >> m >> n;
    int a[201][201];
    memset(a, -1, sizeof(a));
    int i = 0, j = 0;
    for(i = 0; i < m; i++)
        for(j = 0; j < n; j++)
            cin >> a[i][j];
    i = 0, j = 0;
    int total = 0;
    while(total < m * n) {
        while(i <= m-1 && a[i][j] != -1) {//down
            cout << a[i][j] << " ";
            a[i][j] = -1;
            i++;
            total++;
        }
        i--;
        j++;
        while(j <= n-1 && a[i][j] != -1) {//right
            cout << a[i][j] << " ";
            a[i][j] = -1;
            j++;
            total++;
        }
        j--;
        i--;
        while(i >= 0 && a[i][j] != -1) {//up
            cout << a[i][j] << " ";
            a[i][j] = -1;
            i--;
            total++;
        }
        i++;
        j--;
        while(j >= 0 && a[i][j] != -1) {//left
            cout << a[i][j] << " ";
            a[i][j] = -1;
            j--;
            total++;
        }
        j++;
        i++;
    } 
    return 0;
}