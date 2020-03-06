#include <iostream>
using namespace std;
int main() {
    for(int i = 1; i <= 333; i++) {
        for(int j = i+1; j <= 666; j++) {
            for(int k = j+1; k <= 999; k++) {
                if(i + j + k <= 1000 && i*i + j*j == k*k)
                    cout << i << " " << j << " " << k << endl;
            }
        }
    }
    return 0;
}
