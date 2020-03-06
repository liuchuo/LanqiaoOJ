#include <iostream>
#include <cctype>
using namespace std;
bool isprime(int n) {
    if(n <= 1)
        return false;
    for(int i = 2; i * i <= n; i++) {
        if(n % i == 0)
            return false;
    }
    return true;
}

int main() {
    int maxn = -1, minn = 99999999;
    int a[26] = {0};
    string s;
    cin >> s;
    for(int i = 0; i < s.length(); i++) {
        char t = toupper(s[i]);
        a[t-'A']++;
    }
    for(int i = 0; i < 26; i++) {
        maxn = maxn > a[i] ? maxn : a[i];
        if(a[i] != 0)
            minn = minn < a[i] ? minn : a[i];
    }
    if(isprime(maxn-minn)) {
        cout << "Lucky Word" << endl << maxn - minn;
    } else {
        cout << "No Answer" << endl << 0;
    }
    return 0;
}