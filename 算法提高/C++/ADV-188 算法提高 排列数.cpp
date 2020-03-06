#include <iostream>
#include <algorithm>
using namespace std;
int main() {
    string s = "0123456789";
    int n;
    cin >> n;
    int cnt = 1;
    do {
        if(cnt == n) {
            cout << s;
            break;
        }
        cnt++;
    }while(next_permutation(s.begin(), s.end()));
    return 0;
}