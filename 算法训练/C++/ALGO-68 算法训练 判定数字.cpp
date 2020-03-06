#include <iostream>
#include <cctype>
using namespace std;
int main() {
    char c;
    cin >> c;
    if(isdigit(c)) {
        cout << "yes";
    } else {
        cout << "no";
    }
    return 0;
}