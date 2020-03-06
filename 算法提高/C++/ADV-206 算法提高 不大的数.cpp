#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    double t = 1.0;
    for(int i = 1; i <= n; i++) {
        t = t * 2;
        if(i >= 34 && i % 10 == 0) {
            t = t / 1000;
        }
        if(i % 971 == 0) {
            t = t / 10;
        }
    }
    long long int temp = t;
    int sum = 0;
    while(temp) {
        temp = temp / 10;
        sum++;
    }
    while(sum > 10) {
        t = t / 10;
        sum--;
    }
    long long int d = t;
    printf("%lld", d);
    return 0;
}