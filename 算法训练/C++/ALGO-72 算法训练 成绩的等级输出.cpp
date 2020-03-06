#include <iostream>
using namespace std;
int main() {
    double n;
    if(n >= 90) {
        cout << "A";
    } else if(n >= 80) {
        cout << "B";
    } else if(n >= 70) {
        cout << "C";
    } else if(n >= 60) {
        cout << "D";
    } else {
        cout << "E";
    }
    return 0;
}