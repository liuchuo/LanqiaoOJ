#include <iostream>
using namespace std;
int main() {
    int l, r, n;
    cin >> l >> r >> n;
    for(int i = l; i <= r; i++)
        if(i % n == 0) cout << i << " ";
    return 0;
}