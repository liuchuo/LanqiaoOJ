#include <iostream>
#include <cctype>
using namespace std;
int main() {
    char c;
    cin >> c;
    if(isupper(c)) {
        cout << "upper";
    } else {
        cout << "lower";
    }
    return 0;
}