#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    cout << n / 1440 << " ";
    n = n % 1440;
    cout << n / 60 << " ";
    n = n % 60;
    cout << n;
    return 0;
    
}