#include <iostream>
using namespace std;
int main() {
    string s;
    cin >> s;
    for(int i = 0; i < s.length(); i++) {
        if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' || s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {
            cout << i+1;
            return 0;
        }
    }
    cout << 0;
    return 0;
}