#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    int result;
    for (int i = 1; i <= a * b * c; i++) {
        if ((i % a == 0) && (i % b == 0) && (i % c) == 0) {
            result = i;
            break;
        }
    }
    cout << result;
    return 0;
}