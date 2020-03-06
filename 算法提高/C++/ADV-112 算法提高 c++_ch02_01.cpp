#include <iostream>
using namespace std;
int main() {
    char c[10] = {'A','E','I','O','U','a','e','i','o','u'};
    for (int i = 0; i < 10; i++)
        cout << static_cast<int> (c[i]) << endl;
    return 0;
}