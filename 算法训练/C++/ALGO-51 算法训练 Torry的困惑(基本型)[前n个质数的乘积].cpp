#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int count = 0;
    int result = 2;
    int temp = 3;
    while ((count < (n - 1)) && n != 1) {
        int i = 2;
        for (i = 2; i < temp; i++) {
            if (temp % i == 0) {
                break;
            }
        }
        if (i == temp) {
            result = result * temp;
            result = result % 50000;
            count++;
        }
        temp++;
    }
    if (n == 0){
        cout << 0;
    }else{
        cout << result;
    }
    return 0;
}
