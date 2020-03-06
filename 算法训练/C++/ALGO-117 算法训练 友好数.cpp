#include <iostream>
using namespace std;
int main() {
    int a, b, suma = 1, sumb = 1;
    cin >> a>> b;
    for (int i = 2; i * i <= a; i++) {
        if (a % i == 0 && i * i == a) suma += i;
        if (a % i == 0 && i * i != a) suma += i + a / i;
    }
    for (int i = 2; i * i <= b; i++) {
        if (b % i == 0 && i * i == b) sumb += i;
        if (b % i == 0 && i * i != b) sumb += i + b / i;
    }
    if (suma == b && sumb == a) cout << "yes";
    else cout << "no";
    return 0;
}