#include <iostream>
#include <string>
using namespace std;
int main() {
    string s, so = "aoieu";
    cin >> s;
    for(int i = 0; i < so.length(); i++){
        if(so.find(s[i]) != string::npos){
            cout << i + 1 << endl;
            return 0;
        }
    }
    cout << 0 << endl;
    return 0;
}