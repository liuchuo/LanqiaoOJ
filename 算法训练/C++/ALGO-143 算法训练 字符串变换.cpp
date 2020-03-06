#include <iostream>
#include <cctype>
using namespace std;
int main() {
    int n;
    cin >> n;
    string s;
    cin >> s;
    int len = s.length();
    switch(n) {
        case 1:
        case 2:
        case 4:
            for(int i = 0; i < len; i++) {
                if(n == 1)
                    s[i] = toupper(s[i]);
                else if(n == 2)
                    s[i] = tolower(s[i]);
                else {
                    if(isupper(s[i]))
                        s[i] = tolower(s[i]);
                    else
                        s[i] = toupper(s[i]);
                }
            }
            cout << s;
            break;
            
        case 3:
            for(int i = len-1; i >= 0; i--) {
                cout << s[i];
            }
            break;
            
        case 5:
            string t;
            for(int i = 0; i < len; i++) {
                s[i] = tolower(s[i]);
            }
            for(int i = 0; i < len; i++) {
                if(i == 0) {
                    t += s[0];
                } else if(i != len-1) {
                    if(s[i] != s[i-1]+1 || s[i] != s[i+1]-1) {
                        t += s[i];
                    } else if(t[t.length()-1] != '-') {
                        t += '-';
                    }
                } else {
                    t += s[i];
                }
            }
            cout << t;
            break;
    }
    return 0;
}