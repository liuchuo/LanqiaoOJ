#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++)
        cin >> a[i];
    int t;
    cin >> t;
    int i;
    for (i = 0; i < n; i++)
        if (t == a[i]) break;
    if (i == n)
        cout << "-1";
    else
        cout << i + 1;
    return 0;
}