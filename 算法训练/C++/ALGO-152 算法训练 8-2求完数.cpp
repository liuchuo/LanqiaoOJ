#include <iostream>
using namespace std;
int main() {
    for (int i = 6; i <= 9999; i++) {
        int sum = 1;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) 
                sum += j;
        }
        if (sum == i) 
            cout << i << endl;
    }
    return 0;
}