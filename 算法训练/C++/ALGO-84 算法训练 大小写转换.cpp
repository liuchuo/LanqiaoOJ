#include <iostream>
#include <cctype>
#include <string>
using namespace std;
int main() {
    string s;
    cin >> s;
    int len = s.length();
    for (int i = 0; i < len; i++) {
        if (s[i] >= 'A' && s[i] <= 'Z')
            s[i] = tolower(s[i]);
        else
            s[i] = toupper(s[i]);
    }
    cout << s;
}