#include <iostream>
#include <set>
using namespace std;
int main() {
    set<int> s;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        s.insert(temp);
    }
    cout << s.size() << endl;
    for(set<int>::iterator it = s.begin(); it != s.end(); it++) {
        cout << *it << " ";
    }
}