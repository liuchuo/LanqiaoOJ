#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    cin >> s;
    int len = s.length();
    int ans = len;
    for(int i = 1; i < len/2; i++) {
        if(len % i != 0)
            continue;
        int flag = 0;
        string t1, t2;
        t1 = s.substr(0, i);
        for(int j = i; j < len; j = j + i) {
            t2 = s.substr(j, i);
            if(t2 != t1) {
                flag = 1;
                break;
            }
            t1 = t2;
        }
        if(flag == 0)
            ans = ans < i ? ans : i;
    }
    cout << len / ans;
    return 0;
}