#include <iostream>
using namespace std;
int isprime(int n) {
    if(n <= 1)
        return 0;
    else if(n == 2 || n == 3)
        return 1;
    else {
        for(int i = 2; i * i < n; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
int main() {
    int a, b;
    cin >> a >> b;
    for(int i = a; i <= b; i++) {
        int temp = i;
        cout << i << "=";
        int flag = 0;
        while(temp != 1) {
            for(int j = 2; j <= temp; j++) {
                if(isprime(j) && temp % j == 0) {
                    temp = temp / j;
                    if(flag == 1)
                        cout << "*";
                    cout << j;
                    flag = 1;
                    break;
                }
            }
        }
        cout << endl;
    }
    return 0;
}