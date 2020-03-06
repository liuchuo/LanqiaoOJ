#include <iostream>
#include <string>
using namespace std;
int main() {
    int n;
    cin >> n;
    string s;
    while(n) {
        s = (char)(n % 8 + '0') + s;
        n = n / 8;
    }
    cout << s;
    return 0;
}