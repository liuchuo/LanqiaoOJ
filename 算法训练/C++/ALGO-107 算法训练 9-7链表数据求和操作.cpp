#include <iostream>
using namespace std;
int main() {
    int suma = 0, sumb = 0;
    for(int i = 0; i < 10; i++) {
        int a, b;
        cin >> a >> b;
        suma += a;
        sumb += b;
    }
    cout << suma;
    if(sumb >= 0) {
        cout << "+";
    }
    cout << sumb << "i";
    return 0;
}