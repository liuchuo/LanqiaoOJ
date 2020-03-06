#include <iostream>
using namespace std;
int main() {
    string s;
    cin >> s;
    while(s.length() > 1) {
        int ans = 1;
        for(int i = 0; i < s.length(); i++) {
            if(s[i] != '0') {
                ans *= (int)(s[i] - '0');
            }
        }
        s = "";
        while(ans != 0) {
            s += (char)(ans % 10 + '0');
            ans = ans / 10;
        }
    }
    cout << s;
    return 0;
}