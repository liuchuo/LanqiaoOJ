#include <iostream>
#include <vector>
#include <map>
using namespace std;
int main() {
    map<string,char> m;
    m["*-"] = 'a';
    m["-***"] = 'b';
    m["-*-*"] = 'c';
    m["-**"] = 'd';
    m["*"] = 'e';
    m["**-*"] = 'f';
    m["--*"] = 'g';
    m["****"] = 'h';
    m["**"] = 'i';
    m["*---"] = 'j';
    m["-*-"] = 'k';
    m["*-**"] = 'l';
    m["--"] = 'm';
    m["-*"] = 'n';
    m["---"] = 'o';
    m["*--*"] = 'p';
    m["--*-"] = 'q';
    m["*-*"] = 'r';
    m["***"] = 's';
    m["-"] = 't';
    m["**-"] = 'u';
    m["***-"] = 'v';
    m["*--"] = 'w';
    m["-**-"] = 'x';
    m["-*--"] = 'y';
    m["--**"] = 'z';
    string s;
    vector<string> v;
    cin >> s;
    s += '|';
    for(int i = 0; i < s.length(); i++){
        string t;
        for(; s[i] != '|'; i++)
            t += s[i];
        v.push_back(t);
    }
    for(int i = 0; i < v.size(); i++)
        cout << m[v[i]];
    return 0;
}