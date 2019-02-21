#include <iostream>
using namespace std;
int main() {
    int a[200] = {0};
    string s;
    cin >> s;
    for (int i = 0; i < s.length(); i++)
        a[s[i]]++;
    for (int i = 0; i < s.length(); i++)
        if (a[s[i]] == 1) cout << s[i];
    return 0;
}