#include <iostream>
#include <algorithm>
#include <set>
#include <map>
using namespace std;
int main() {
    int k, n;
    cin >> k;
    while (k--) {
        string ans = "";
        cin >> n;
        map<string, set<string> > m;
        map<string, int> vis;
        for (int i = 0; i < n; i++) {
            string s1, s2;
            cin >> s1 >> s2;
            m[s1];
            m[s2].insert(s1);
        }
        while (1) {
            int check = 0;
            for (map<string, set<string> >::iterator i = m.begin(); i != m.end(); i++) {
                string girl = i->first;
                if (vis[girl] == 0 && m[girl].size() == 0) {
                    check = 1;
                    vis[girl] = 1;
                    for (map<string, set<string> >::iterator j = m.begin(); j != m.end(); j++) {
                        j->second.erase(girl);
                    }
                    ans = ans + girl + " ";
                    break;
                }
            }
            if (check == 0) break;
        }
        cout << ans.substr(0, ans.length() - 1) << endl;
    }
    return 0;
}