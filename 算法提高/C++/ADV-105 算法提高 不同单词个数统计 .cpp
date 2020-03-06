#include <iostream>
#include <set>
using namespace std;
int main() {
    string t;
    set<string> s;
    while(cin >> t) s.insert(t);
    cout << s.size();
    return 0;
}