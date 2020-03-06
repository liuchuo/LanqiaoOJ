#include <iostream>
#include <cmath>
using namespace std;
int maxvalue = 0;
int pic[8][8];

bool issafe(int pos[], int row) {
    for(int i = 0; i < row; i++) {
        if(pos[i] == pos[row] || abs(i - row) == abs(pos[i] - pos[row]))
            return false;
    }
    return true;
}
void dfs(int pos[], int row) {
    if(row == 8) {
        int sum = 0;
        for(int i = 0; i < 8; i++) {
            sum += pic[i][pos[i]];
        }
        maxvalue = sum > maxvalue ? sum : maxvalue;
        return ;
    }
    for(pos[row] = 0; pos[row] < 8; pos[row]++) {
        if(issafe(pos, row)) {
            dfs(pos, row + 1);
        }
    }
}

int main() {
    int pos[8];
    for(int i = 0; i < 8; i++) {
        for(int j = 0; j < 8; j++) {
            cin >> pic[i][j];
        }
    }
    dfs(pos, 0);
    cout << maxvalue;
    return 0;
}