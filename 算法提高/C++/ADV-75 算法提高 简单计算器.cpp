#include <iostream>
using namespace std;
int main() {
    char c;
    int a, b;
    cin >> c >> a >> b;
    switch(c) {
        case '+':
            cout << a + b;
            break;
        case '-':
            cout << a - b;
            break;
        case '*':
            cout << a * b;
            break;
        case '/':
            cout << a / b;
            break;
    }
    return 0;
}