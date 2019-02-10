#include <iostream>
#include <cstring>
using namespace std;
int main() {
    int k;
    cin >> k;
    while (k--) {
        int n, m, sx, sy, ex, ey;
        char cc[100][100];
        memset(cc, '0', sizeof(cc));
        cin >> n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                scanf(" %c ", &cc[i][j]);
                if (cc[i][j] == 'S') {
                    sx = i;
                    sy = j;
                }
                if (cc[i][j] == 'T') {
                    ex = i;
                    ey = j;
                }
            }
        }
        cin >> m;
        while (m--) {
            int nowx = sx, nowy = sy, flag = 0;
            string s;
            cin >> s;
            for (int i = 0; i < s.length(); i++) {
                if (s[i] == 'R') nowy++;
                if (s[i] == 'L') nowy--;
                if (s[i] == 'U') nowx--;
                if (s[i] == 'D') nowx++;
                if (cc[nowx][nowy] == '#') {
                    flag = 1;
                    cout << "I am dizzy!\n";
                    break;
                } else if (cc[nowx][nowy] == '0') {
                    flag = 1;
                    cout << "I am out!\n";
                    break;
                } else if (cc[nowx][nowy] == 'T') {
                    flag = 1;
                    cout << "I get there!\n";
                    break;
                }
            }
            if (flag == 0)
                cout << "I have no idea!\n";
        }
    }
    return 0;
}