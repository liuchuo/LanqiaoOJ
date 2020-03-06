#include <iostream>
using namespace std;
int main() {
    string a[5];
    int m = 0;
    int j = -1;
    for(int i = 0; i < 5; i++) {
        cin >> a[i];
        if(a[i].length() > m) {
            m = a[i].length();
            j = i;
        }
    }
    cout << a[j];
    return 0;
}