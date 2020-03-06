#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    int n, b;
    cin >> n >> b;
    vector<int> v;
    for(int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        if(temp % b != 0) {
            v.push_back(temp);
        }
    }
    sort(v.begin(), v.end());
    for(int i = 0; i < v.size(); i++) {
        if(v[i] >= 'A' && v[i] <= 'Z') {
            cout << (char)(v[i]) << " ";
        } else {
            cout << v[i];
        }
    }
    return 0;
}
