#include <iostream>
using namespace std;
int main() {
    int m = 0, x = 1, y = 1;
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 4; j++) {
            int temp;
            cin >> temp;
            if(temp < 0)
                temp = 0 - temp;
            if(temp > m) {
                m = temp;
                x = i+1;
                y = j+1;
            }
        }
    }
    cout << m << " " << x << " " << y;
    return 0;
}