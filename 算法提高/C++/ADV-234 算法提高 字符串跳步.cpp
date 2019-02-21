#include <iostream>
#include <string>
using namespace std;
int main() {
    string s;
    int star, step;
    cin >> s >>  star >> step;
    for(int i = 0; star+ i * step <= s.size(); i++) 
        cout << s[star + i * step];
    return 0;
}