#include <iostream>
#include <iomanip>
using namespace std;
void add(int a, int b, int m, int n);
void min(int a, int b, int m, int n);
void multi(int a, int b, int m, int n);
void div1(int a, int b, int m, int n);
int main() {
    int a,b,m,n;
    char c;
    cin >> a >> b;
    cin >> c;
    cin >> m >> n;
    switch(c) {
        case '+': add(a, b, m, n); break;
        case '-': min(a, b, m, n); break;
        case '*': multi(a, b, m, n); break;
        case '/': div1(a, b, m, n); break;
    }
    return 0;
}
void add(int a, int b, int m, int n) {
    int l, r;
    l = a + m;
    r = b + n;
    if (l != 0){
        if (r != 0) {
            if (r > 0)
                cout << l << "+" << r << "i";
            else
                cout << l << r << "i";
        }
        else {
            cout << l;
        }
    }
    else {
        if (r != 0) {
            cout << r << "i";
        }
        else {
            cout << 0;
        }
    }
}
void min(int a, int b, int m, int n) {
    int l, r;
    l = a - m;
    r = b - n;
    if (l != 0) {
        if (r != 0) {
            if (r > 0)
                cout << l << "+" << r << "i";
            else
                cout << l << r << "i";
        }
        else {
            cout << l;
        }
    }
    else {
        if (r != 0) {
            cout << r << "i";
        }
        else {
            cout << 0;
        }
    }
}
void multi(int a, int b, int m, int n) {
    int l, r;
    l = a * m - b * n;
    r = a * n + b * m;
    if (l != 0) {
        if (r != 0) {
            if (r > 0)
                cout << l << "+" << r << "i";
            else
                cout << l << r << "i";
        }
        else {
            cout << l;
        }
    }
    else {
        if (r != 0) {
            cout << r << "i";
        }
        else {
            cout << 0;
        }
    }
}
void div1(int a, int b, int m, int n) {
    if (m == 0 && n == 0) {
        cout << "error";
    } else {
        double l, r;
        l = (double)(a * m + b * n) / (m * m + n * n);
        r = (double)(b * m - a * n) / (m * m + n * n);
        
        if (l != 0) {
            if (r != 0) {
                if (r > 0) {
                    cout << setprecision(1) << l << "+" << r << endl;
                }
                else {
                    cout << setprecision(1) << l  << r << "i" << endl;
                }
            }
            else {
                cout << setprecision(1) << l << endl;
            }
        } else {
            if (r != 0) {
                cout << setprecision(1) << r << "i" << endl;
            }
            else {
                cout << 0;
            }
        }
    }
}
