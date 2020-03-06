#include <iostream>
using namespace std;
int main() {
    string s;
    cin >> s;
    int cnt = 0;
    for(int i = 0; i < s.length(); i++) {
        if(isdigit(s[i]))
            cnt++;
    }
    cout << cnt;
    return 0;
}