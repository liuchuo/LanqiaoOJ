#include <iostream>
#include <map>
#include <cmath>
using namespace std;
int main() {
    int n, maxn = 0;
    string s;
    map<string, int> m;
    cin >> n;
    for (int i = 0; i < n; i++) {
        getline(cin,s);
        m[s]++;
        maxn = max(maxn, m[s]);
    }
    for (map<string, int>::iterator i = m.begin(); i != m.end(); i++) {
        if (i->second == maxn)
            cout << i->first << endl;
    }
    return 0;
}