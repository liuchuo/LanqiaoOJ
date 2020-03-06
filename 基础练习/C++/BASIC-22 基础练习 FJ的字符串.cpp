#include <iostream>
using namespace std;
string dfs(int n) {
    if(n == 1) {
        return "A";
    } else {
        return dfs(n - 1) + (char)(n + 'A' - 1) + dfs(n - 1);
    }
}
int main() {
    int n;
    cin >> n;
    cout << dfs(n);
    return 0;
}

