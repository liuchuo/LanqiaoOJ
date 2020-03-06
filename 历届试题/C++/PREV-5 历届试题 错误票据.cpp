#include <iostream>
#include <set>
using namespace std;
int main() {
    set<int> s;
    int row, a, m = 0, n = 0, size;
    cin >> row;
    while(cin >> a) {
        size = s.size();
        s.insert(a);
        if(s.size() == size) {
            n = a;
        }
    }
    set<int>::iterator it = s.begin();
    set<int>::iterator itt = it;
    for(it++ ; it != s.end(); it++, itt++) {
        
        if(*it != *itt + 1) {
            m = *itt + 1;
        }
    }
    cout << m << " " << n;
    return 0;
}