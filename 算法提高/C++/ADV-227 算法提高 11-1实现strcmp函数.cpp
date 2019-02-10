#include <iostream>
#include <algorithm>
#include <vector>
#include <cctype>
#include <map>
using namespace std;
int f(string s1, string s2) {
    s1 += char(0);
    s2 += char(0);
    for (int i = 0; i < s1.length() && i < s2.length(); i++) {
        if (s1[i] < s2[i]) return -1;
        if (s1[i] > s2[i]) return 1;
    }
    return 0;
}
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    cout << f(s1, s2);
    return 0;
}