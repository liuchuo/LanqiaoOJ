#include <iostream>
#include <string>
using namespace std;
void add(int a, int b) {cout << a + b;}
void min(int a, int b) {cout << a - b;}
void mul(int a, int b) {cout << a * b;}
void div1(int a, int b) {cout << a / b;}

int main() {
    string s;
    int a, b;
    getline(cin, s);
    if (s[3] == ' ') {
        a = s[2] - '0';
        if (s[5] == '\0') {
            b = s[4] - '0';
        }
        else {
            b = 10;
        }
    }
    else {
        a = 10;
        if (s[6] == '\0') {
            b = s[5] - '0';
        }
        else {
            b = 10;
        }
    }
    switch(s[0]) {
        case '+':add(a, b);break;
        case '-':min(a, b);break;
        case '*':mul(a, b);break;
        case '/':div1(a, b);break;
    }
    return 0;
}
