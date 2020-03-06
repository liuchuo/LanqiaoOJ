#include <iostream>
#include <queue>
using namespace std;
int main() {
    int n;
    cin >> n;
    queue<int> q;
    for (int i = 0; i < n; i++) {
        int query, temp;
        cin >> query;
        if (query == 1) {
            cin >> temp;
            q.push(temp);
        } else if (query == 2) {
            if (q.empty()) {
                cout << "no" << endl;
                return 0;
            } else {
                cout << q.front() << endl;
                q.pop();
            }
        } else if (query == 3) {
            cout << q.size() << endl;
        }
    }
    return 0;
}
