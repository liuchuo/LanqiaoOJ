#include <iostream>
using namespace std;
int main() {
    string a, b;
    cin >> a >> b;
    int lena = a.length();
    int lenb = b.length();
    int len = lena > lenb ? lena : lenb;
    for(int i = 0; i < len; i++) {
        if(a[i] > b[i]) {
            cout << "1";
            return 0;
        }
        if(a[i] < b[i]) {
            cout << "-1";
            return 0;
        }
    }
    if(lena == lenb) {
        cout << "0";
    } else if(lena > lenb) {
        cout << "1";
    }else {
        cout << "-1";
    }
    return 0;
}