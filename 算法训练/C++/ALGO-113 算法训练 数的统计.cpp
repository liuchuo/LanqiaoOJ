#include <iostream>
int a[1000001];
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        a[temp]++;
    }
    for(int i = 0; i <= 1000000; i++) {
        if(a[i] != 0) {
            cout << i << " " << a[i] << endl;
        }
    }
    return 0;
}