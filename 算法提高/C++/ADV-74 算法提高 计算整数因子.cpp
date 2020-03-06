#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    for(int i = 2; i < n; i++) {
        int flag = 0;
        for(int j = 2; j * j <= i; j++) {
            if(i % j == 0)
                flag = 1;
        }
        if(flag == 0 && n % i == 0)
            cout << i << " ";
    }
    return 0;
}