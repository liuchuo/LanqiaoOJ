#include <iostream>
using namespace std;
int a[10001];
int main() {
    int n;
    cin >> n;
    for(int i = 1; i <= n; i++) {
        int temp = i;
        int num = i;
        while(num) {
            temp += num%10;
            num = num/10;
        }
        a[temp] = 1;
    }
    for(int i = 1; i <= n; i++) {
        if(a[i] == 0)
            cout << i << endl;
    }
    return 0;
}