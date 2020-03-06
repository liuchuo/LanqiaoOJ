#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    cin >> s;
    int len = s.length();
    for(int i = 1; i <= len / 2; i++) {
        int flag = 0;
        if(len % i != 0)
            continue;
        string t1 = s.substr(0, i);
        string t2;
        for(int j = i; j < len; j = j + i) {
            t2 = s.substr(j, i);
            if(t1 != t2) {
                flag = 1;
                break;
            }
        }
        if(flag == 0) {
            cout << i;
            return 0;
        }
    }
    cout << len;
    return 0;
}