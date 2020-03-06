#include <iostream>
#include <string>
using namespace std;
int main() {
    string a;
    cin >> a;
    int result = 0;
    int b[15] = {7, 9, 10, 5, 8, 4, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    for (int i = 0; i < 15; i++)
        result += (a[i] - '0') * b[i];
    result = result % 11;
    string c = "10x98765432";
    for (int i = 0; i <= 5; i++)
        cout << a[i];
    cout << "19";
    for (int i = 6; i <= 14; i++)
        cout << a[i];
    cout << c[result];
    return 0;
}
