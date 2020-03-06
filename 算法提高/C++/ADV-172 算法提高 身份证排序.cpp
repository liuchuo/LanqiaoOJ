#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
int cmp1(string a, string b) {
    string bira = a.substr(6, 8);
    string birb = b.substr(6, 8);
    if(bira != birb) {
        return bira > birb;
    } else {
        return a > b;
    }
    return 0;
}
int main() {
    int n;
    cin >> n;
    vector<string> v(n);
    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }
    sort(v.begin(), v.end(), cmp1);
    for(int i = 0; i < n; i++) {
        cout << v[i] << endl;
    }
    return 0;
}