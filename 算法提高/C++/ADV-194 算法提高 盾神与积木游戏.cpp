#include <iostream>
#include <algorithm>
using namespace std;
struct node {
    int t1, t2, res;
};
int cmp1(node p, node q) {
    return p.res > q.res;
}
int main() {
    int m, n;
    cin >> m;
    for(int i = 0; i < m; i++) {
        cin >> n;
        int t = 0;
        int flag = 0;
        node *a = new node[n];
        for(int j = 0; j < n; j++) {
            cin >> a[j].t1 >> a[j].t2;
            a[j].res = a[j].t1 - a[j].t2;
            if(a[j].res >= 0) {
                a[j].res = -99999999;
                t += a[j].t1;
            }
        }
        sort(a, a+n, cmp1);
        int k = 0;
        while(a[k].res != -99999999) {
            t += a[k].res;
            if(t < 0) {
                cout << "NO" << endl;
                flag = 1;
                break;
            }
            t += a[k].t2;
            k++;
        }
        if(flag == 0)
            cout << "YES" << endl;
    }
    return 0;
}