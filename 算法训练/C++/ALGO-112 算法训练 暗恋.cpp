#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;
int m[210][210], ans = 0, r, c;
int  check(int a, int b){
    for(int k = 1;; k++){
        for(int i = a; i <= a + k; i++)
            if(m[i][b+k] != m[a][b]) return k * k;
        for(int i = b; i <= b + k; i++)
            if(m[a+k][i] != m[a][b]) return k * k;
    }
}
int main() {
    fill(m[0],m[0]+210*210,-1);
    scanf("%d%d", &r, &c);
    for(int i = 1; i <= r ; i++)
        for(int j = 1; j <= c; j++)
            scanf("%d",&m[i][j]);
    for(int i = 1; i <= r ; i++)
        for(int j = 1; j <= c; j++)
            ans = max(ans,check(i,j));
    cout << ans << endl;
    return 0;
}