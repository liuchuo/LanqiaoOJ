#include <iostream>
using namespace std;
int main() {
    int a, b;
    cin >> a >> b;
    if(a == 0 || b == 0)
        return 0;
    for(int i = 1; i <= a * 2 + 1; i++) {
        if(i % 2 == 1) {
            for(int j = 1; j <= b * 2 + 1; j++) {
                if(j % 2 == 1) {
                    cout << "+";
                } else {
                    cout << "-";
                }
            }
        } else {
            for(int j = 1; j <= b * 2 + 1; j++) {
                if(j % 2 == 1) {
                    cout << "|";
                } else {
                    cout << " ";
                }
            }
        }
        cout << endl;
    }
    return 0;
}