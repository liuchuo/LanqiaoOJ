#include <iostream>
#include <list>
#include <string>
#include <iterator>
using namespace std;

int main() {

    int n = 0, m = 0;
    cin >> n >> m;
    list<string> l;
    for (int i = 0; i < n; i++) {
        string c;
        cin >> c;
        l.push_back(c);
    }
    
    for (int i = 0; i < m; i++) {
        string c;
        cin >> c;
        if (c == "DEL") {
            string p;
            cin >> p;
            for (list<string>::iterator it = l.begin(); it != l.end(); it++) {
                if (*it == p) {
                    l.erase(it);
                    break;
                }
            }
            
        } else if (c == "ADD") {
            string p, q;
            cin >> p >> q;
            for (list<string>::iterator it = l.begin(); it != l.end(); it++) {
                if (*it == p) {
                    l.insert(it, q);
                    break;
                }
            }
        }
    }
    
    cout << l.size() << endl;
    for (list<string>::iterator it = l.begin(); it != l.end(); it++) {
        cout << *it << " ";
    }
    return 0;
}
