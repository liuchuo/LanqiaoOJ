#include <iostream>
using namespace std;
struct note {
    int x;
    int y;
    int f;
    int s;
    char dir;
};
int main() {
    char a[501][501];
    int n, m;
    cin >> n >> m;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            cin >> a[i][j];
        }
        getchar();
    }
    int head = 1;
    int tail = 1;
    int book[501][501] = {0};
    book[1][1] = 1;
    
    int next[4][2] = {
        {1, 0},
        {0, -1},
        {0, 1},
        {-1, 0}
    };
    int tx = 1;
    int ty = 1;
    
    struct note que[250001];
    que[tail].x = 1;
    que[tail].y = 1;
    que[tail].f = 0;
    que[tail].s = 0;
    tail++;
    int flag = 0;
    while (head < tail) {
        for (int k = 0; k <= 3; k++) {
            tx = que[head].x + next[k][0];
            ty = que[head].y + next[k][1];
            
            if (tx < 1 || tx > n || ty < 1 || ty > m)
                continue;
            if (a[tx][ty] == '0' && book[tx][ty] == 0) {
                book[tx][ty] = 1;
                que[tail].x = tx;
                que[tail].y = ty;
                que[tail].f = head;
                que[tail].s = que[head].s + 1;
                if (k == 0) que[tail].dir = 'D';
                else if (k == 1) que[tail].dir = 'L';
                else if (k == 2) que[tail].dir = 'R';
                else if (k == 3) que[tail].dir = 'U';
                tail++;
            }
            if (tx == n && ty == m) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            break;
        }
        head++;
    }
    cout << que[tail - 1].s << endl;
    char t[250001];
    int temp = tail - 1;
    for (int i = que[tail - 1].s; i >= 1; i--) {
        t[i] = que[temp].dir;
        temp = que[temp].f;
    }
    for (int i = 1; i <= que[tail - 1].s; i++) {
        cout << t[i];
    }
    return 0;
}