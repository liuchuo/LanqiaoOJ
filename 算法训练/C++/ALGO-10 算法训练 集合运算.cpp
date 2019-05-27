#include <iostream>
#include <map>
using namespace std;
int main() {
    int n, m, t;
    map<int, int> a;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &t);
        a[t] = 1;
    }
    scanf("%d", &m);
    for (int i = 0; i < m; i++) {
        scanf("%d", &t);
        a[t] += 2;
    }
    for (map<int, int>::iterator i = a.begin(); i != a.end(); i++)
        if (i->second == 3) cout << i->first << ' ';
    cout << endl;
    for (map<int, int>::iterator i = a.begin(); i != a.end(); i++)
        cout << i->first << ' ';
    cout << endl;
    for (map<int, int>::iterator i = a.begin(); i != a.end(); i++)
        if (i->second == 1) cout << i->first << ' ';
    cout << endl;
    return 0;
}