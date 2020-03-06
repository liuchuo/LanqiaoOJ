#include <iostream>
using namespace std;
int main() {
    string a[201];
    string s;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        if(i == 0) {
            a[i] = "sin(1";
            continue;
        }
        a[i] = a[i - 1];
        if(i % 2 == 1) {
            a[i] += "-";
        } else {
            a[i] += "+";
        }
        a[i] += "sin(";
        a[i] += (char)(i + '1');
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <= i; j++) {
            a[i] += ")";
        }
    }
    for(int i = 2; i <= n; i++) {
        s += "(";
    }
    for(int i = n - 1; i >= 1; i--) {
        s += a[n - 1 - i];
        s += "+";
        s += (char)(i + 1 + '0');
        s += ")";
    }
    s += a[n-1];
    s += "+1";
    cout << s;
    return 0;
}