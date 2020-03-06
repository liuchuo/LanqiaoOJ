#include <iostream>
#include <string>
using namespace std;
int main() {
    int cnt = 0;
    string s1, s2;
    cin >> s1 >> s2;
    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] != s2[i]) {
            if (s1[i] == 'o') s1[i] = '*';
            else s1[i] = 'o';
            if (s1[i + 1] == 'o') s1[i + 1] = '*';
            else s1[i + 1] = 'o';
            cnt++;
        }
    }
    cout << cnt;
    return 0;
}