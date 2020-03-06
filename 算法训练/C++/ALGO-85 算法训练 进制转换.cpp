#include <iostream>
#include <cmath>
using namespace std;
int main() {
    string s;
    cin >> s;
    int len = s.length() - 1;
    int cnt = 0;
    for(int i = len; i >= 0; i--) {
        if(s[i] == '1') {
            cnt += pow(2, len - i);
        }
    }
    cout << cnt;
    return 0;
}