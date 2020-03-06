#include <iostream>
using namespace std;
int main() {
    string s;
    string temp;
    int mmax = 0;
    while(cin >> temp) {
        int len = temp.length();
        if(mmax < len) {
            mmax = len;
            s = temp;
        }
    }
    cout << s;
    return 0;
}