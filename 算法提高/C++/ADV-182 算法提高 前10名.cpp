#include <iostream>
#include <algorithm>
using namespace std;
int cmp1(int a, int b) {return a > b;}
int main() {
    int n;
    cin >> n;
    int *a = new int[n];
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    sort(a, a+n, cmp1);
    for(int i = 0; i < 10; i++)
        cout << a[i] << " ";
    delete [] a;
    return 0;
}