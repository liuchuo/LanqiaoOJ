#include <iostream>
using namespace std;
int main() {
    int h = 0, m = 0, s = 0, t;
    cin >> t;
    h = t / 3600;
    t = t % 3600;
    m = t / 60;
    t = t % 60;
    s = t;
    cout << h << ":" << m << ":" << s;
    return 0;
}

