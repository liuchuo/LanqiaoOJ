#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    cin >> s;
    int a = 0;
    int sum = 0;
    for(int i = 0; i < s.length(); i++) {
        int temp = s[i] - '0';
        a = a * 10 + temp;
        sum += (temp * temp * temp);
    }
    if(sum == a) {
        cout << "YES";
    } else {
        cout << "NO";
    }
    return 0;
}