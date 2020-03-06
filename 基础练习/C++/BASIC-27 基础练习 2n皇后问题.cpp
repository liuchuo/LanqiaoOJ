#include <iostream>
#include <cmath>
#include <vector>
using namespace std;
int cnt = 0;
bool issafe(vector<vector<int> > pic, vector<int> pos, int row) {
    for(int i = 0; i < row; i++) {
        if(pos[i] == pos[row] || abs(i - row) == abs(pos[i] - pos[row]))
            return false;
    }
    return true;
}
void blackdfs(vector<vector<int> > blackpic, vector<int> blackpos, int n, int blackrow) {
    if(blackrow == n) {
        cnt++;
        return ;
    }
    for(blackpos[blackrow] = 0; blackpos[blackrow] < n; blackpos[blackrow]++) {
        if(blackpic[blackrow][blackpos[blackrow]] == 1 && issafe(blackpic, blackpos, blackrow)) {
            blackdfs(blackpic, blackpos, n, blackrow + 1);
        }
    }
}
void dfs(vector<vector<int> > pic, vector<int> pos, int n, int row) {
    if(row == n) {
        vector<vector<int> > blackpic(n, vector<int>(n));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                blackpic[i][j] = pic[i][j];
            }
        }
        for(int i = 0; i < n; i++) {
            blackpic[i][pos[i]] = 0;
        }
        vector<int> blackpos(n);
        blackdfs(blackpic, blackpos, n, 0);
        return ;
    }
    for(pos[row] = 0; pos[row] < n; pos[row]++) {
        if(pic[row][pos[row]] == 1 && issafe(pic, pos, row)) {
            dfs(pic, pos, n, row + 1);
        }
    }
}
int main() {
    int n;
    cin >> n;
    vector<vector<int> > pic(n, vector<int>(n));
    vector<int> pos(n);
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cin >> pic[i][j];
        }
    }
    dfs(pic, pos, n, 0);
    cout << cnt;
    return 0;
}