#include <iostream>
#include <algorithm>
#include <vector>
#include <cctype>
#include <map>
using namespace std;
string encrypt(string s) {
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == 'Z') s[i] = 'a';
        else if (s[i] == 'z') s[i] = 'A';
        else if (isalpha(s[i])) s[i]++;
    }
    return s;
}
int main() {
    string s;
    cin >> s;
    cout << encrypt(s);
    return 0;
}