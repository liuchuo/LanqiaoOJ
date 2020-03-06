#include <iostream>
#include <string>
using namespace std;
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    for (int i = 0; i < s1.length() && i < s2.length(); i++) {
        if (s1[i] != s2[i]) {
            cout << s1[i] - s2[i] << endl;
            return 0;
        }
    }
    cout << 0 << endl;
    return 0;
}