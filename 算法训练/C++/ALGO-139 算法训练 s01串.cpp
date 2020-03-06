#include <iostream>
#include <string>
using namespace std;
int main() {
    int n;
    cin >> n;
    string s = "0";
    while(n--) {
        for(int i = 0; i < s.length(); i++) {
            if(s[i] == '0') {
                s[i] = '1';
            } else {
                s.insert(i, "0");
                i = i+1;
            }
        }
    }
    cout << s;
    return 0;
}