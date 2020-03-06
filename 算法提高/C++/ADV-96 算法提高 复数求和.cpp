#include <iostream>
using namespace std;
int main() {
    int a = 0, b = 0;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        int ta, tb;
        cin >> ta >> tb;
        a += ta;
        b += tb;
    }
    cout << a;
    if(b >= 0) {
        cout << "+" << b << "i";
    } else if(b < 0) {
        cout << b << "i";
    }
    return 0;
}