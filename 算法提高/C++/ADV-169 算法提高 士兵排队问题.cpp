#include <iostream>
#include <cstring>
#include <vector>
#include <set>
using namespace std;
int main() {
    int in[151], vis[150] = {0};
    set<int> se;
    vector<int> a[150];
    memset(in, -1, sizeof(in));
    string s, ans;
    while (cin >> s) {
        if (in[s[0]] == -1) in[s[0]] = 0;
        if (in[s[2]] == -1) in[s[2]] = 0;
        in[s[2]]++;
        a[s[0]].push_back(s[2]);
        se.insert(s[0]);
        se.insert(s[2]);
    }
    while (1) {
        int cnt = 0, begin;
        for (int i = 1; i <= 150; i++) {
            if (in[i] == 0 && vis[i] == 0) {
                begin = i;
                cnt++;
            }
        }
        if (cnt == 0) {
            if (ans.length() == se.size()) {
                cout << ans;
            } else
                cout << "No Answer!";
            break;

        } else {
            ans += (char) begin;
            vis[begin] = 1;
            for (int i = 0; i < a[begin].size(); i++)
                in[a[begin][i]]--;
        }
    }
    return 0;
}