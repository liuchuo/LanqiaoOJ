#include <iostream>
#include <vector>
using namespace std;
int a[100005] = {0};
vector<int> p;
void getprime() {
    a[0] = a[1] = 1;
    for (int i = 2; i * i <= 100000; i++) {
        if (a[i] == 0) {
            for (int j = i * i; j <= 100000; j = j + i) 
                a[j] = 1;
        }
    }
    for (int i = 2; i <= 100000; i++) 
        if (a[i] == 0) p.push_back(i);
}
void check(int n) {
    for (int i = 0; i < p.size(); i++) {
        if (n % p[i] == 0 && a[n / p[i]] == 0) {
            cout << "Yes\n";
            return;
        }
    }
    cout << "No\n";
}
int main() {
    getprime();
    int n, k;
    cin >> k;
    while (k--) {
        cin >> n;
        check(n);
    }
    return 0;
}