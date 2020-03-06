#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int cmp1(int a, int b) {return a > b; }
int main() {
    vector<vector <int> > v(5);
    int s;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        cin >> s;
        if(s >= 90 && s <= 100) {
            v[0].push_back(s);
        } else if(s >= 80 && s <= 89) {
            v[1].push_back(s);
        } else if(s >= 70 && s <= 79) {
            v[2].push_back(s);
        } else if(s >= 60 && s <= 69) {
            v[3].push_back(s);
        } else {
            v[4].push_back(s);
        }
    }
    int maxn = 0, index = -1;
    for(int i = 0; i < 5; i++) {
        cout << v[i].size() << " ";
        if(v[i].size() > maxn) {
            maxn = v[i].size();
            index = i;
        }
    }
    cout << endl << maxn << endl;
    sort(v[index].begin(), v[index].end(), cmp1);
    for(int i = 0; i < v[index].size(); i++) {
        cout << v[index][i] << " ";
    }
    return 0;
}