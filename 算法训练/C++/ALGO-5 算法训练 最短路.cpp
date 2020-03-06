#include <iostream>
using namespace std;
int main() {
    int dis[20001] = {0}, u[200001], v[200001],w[200001];
    int n, m, inf = 99999999;
    fill(dis+2,dis+20001,inf);
    scanf("%d %d", &n, &m);
    for(int i = 1;  i <= m; i++)
        scanf("%d %d %d",&u[i], &v[i], &w[i]);
    for(int k = 1; k <= n - 1; k++){
        int  check = 0;
        for(int i = 1; i <= m; i++){
            if(dis[v[i]] > dis[u[i]] + w[i]){
                dis[v[i]] = dis[u[i]] + w[i];
                check = 1;
            }
        }
        if(check == 0) break;
    }
    for(int i = 2; i <= n; i++)
        printf("%d\n",dis[i]);
    return 0;
}