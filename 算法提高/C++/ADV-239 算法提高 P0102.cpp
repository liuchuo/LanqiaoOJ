#include <iostream>
#include <string>
using namespace std;
int f(char c) {
    if ('0' <= c && c <= '9') return c - '0';
    else return c - 'A' + 10;
}
int main() {
    string s, anso;
    int ansd, t;
    cin >> s;
    t = ansd = f(s[0]) * 16 * 16 + f(s[1]) * 16 + f(s[2]);
    while (t) {
        anso = (char) (t % 8 + '0') + anso;
        t /= 8;
    }
    string s0(4-anso.length(),'0');
    printf("Hex: 0x%s\n", s.c_str());
    printf("Decimal: %d\n", ansd);
    printf("Octal: %s%s\n",s0.c_str(), anso.c_str());
    return 0;
}