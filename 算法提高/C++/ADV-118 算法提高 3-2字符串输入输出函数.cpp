#include <iostream>
using namespace std;
void GetReal() {
    cout << "please input a number:\n";
}

void GetString() {
    cout << "please input a string:\n";
}

int main() {
    GetReal();
    GetString();
    string n, s;
    cin >> n >> s;
    cout << n << endl << s;
    return 0;
}