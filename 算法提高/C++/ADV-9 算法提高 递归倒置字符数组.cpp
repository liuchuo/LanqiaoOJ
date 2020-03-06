#include <iostream>
using namespace std;
string s;
void func(int head, int tail) {
    if(tail - head <= 0)
        return ;
    swap(s[head], s[tail]);
    cout << s << endl;
    func(head+1, tail-1);
}
int main() {
    int n;
    cin >> n >> s;
    func(0, n-1);
    cout << endl << s << endl;
    return 0;
}