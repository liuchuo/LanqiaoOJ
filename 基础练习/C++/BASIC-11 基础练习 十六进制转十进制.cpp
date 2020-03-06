#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    while (cin >> s) {
        int len = s.length();
        long long sum = 0;
        for (int i = 0; i < len; i++) {
            if (s[i] >= 'A' && s[i] <= 'F') {
                sum = sum * 16 + s[i] - 'A' + 10;
            }
            else {
                sum = sum * 16 + s[i] - '0';
            }
        }
        cout << sum;
    }
    return 0;
}