#include <iostream>
using namespace std;

void func(int a);

int main() {
    int n;
    cin >> n;
    func(n);
    return 0;
}

void func(int a) {
    int i = 0;
    int s[100] = {0};
    if(a == 0) {
        cout << "";
    }
    else {
        while (a != 0) {
            s[i++] = a % 2;
            a = a / 2;
        }
        int t = 0;
        for (int c = 0; c <= i - 1; c++) {
            if (s[c] == 1) {
                t = c;break;
            }
        }
        for (int j = i - 1; j >= t + 1; j--) {
            if (s[j] != 0) {
                if (j == 1) {
                    cout << "2+";
                }
                else if (j == 2) {
                    cout << "2(2)+";
                }
                else {
                    cout << "2(";
                    func (j);
                    cout << ")+";
                    }
            }
        }
        if (t == 0) {
            cout << "2(0)";
        }
        else if (t == 1) {
            cout << "2";
        }
        else if (t == 2) {
            cout << "2(2)";
        }
        else {
            cout << "2(";
            func(t);
            cout << ")";
            
        }
    }
}