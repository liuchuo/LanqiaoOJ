#include<iostream>
#include<vector>
#include<algorithm>
#include<queue>
using namespace std;
const int maxn = 200010, inf = 99999999;
struct Edge{
	int from, to, dist;
	Edge(int u, int v, int d):from(u), to(v), dist(d) { }
};
vector<Edge> edges;
vector<int> G[maxn];
int n, m, d[maxn];
//int cnt[maxn];		//	用于判断是否有负环	 
bool inq[maxn];		// 判断结点是否在队列中 
//bool bellman_ford(int s){
void bellman_ford(int s){
	queue<int> Q;
	fill(inq, inq+maxn, false);
	//memset(cnt, 0, sizeof(cnt));
	for(int i = 1; i <= n; i++)	d[i] = inf;
	d[s] = 0;
	inq[s] = true;
	Q.push(s);
	
	while(!Q.empty()){
		int u = Q.front(); Q.pop();
		inq[u] = false;
		for(int i = 0; i < G[u].size(); i++){
			Edge& e = edges[G[u][i]];
			if(d[u] < inf && d[e.to] > d[u] + e.dist){
				d[e.to] = d[u] + e.dist;
				if(!inq[e.to]){
					Q.push(e.to);
					inq[e.to] = true;
//					if(++cnt[e.to] > n)
//						return false;
				}
			}
		}
	}
//	return true;
} 
int main(){
	scanf("%d%d", &n, &m);
	for(int i=0;i<m;i++){
		int from, to, dist;
		scanf("%d%d%d", &from, &to, &dist);
		edges.push_back(Edge(from, to, dist));
		G[from].push_back(edges.size()-1);
	}
	bellman_ford(1);
	for(int i=2;i<=n;i++){
		printf("%d\n", d[i]);
	}
	return 0;
}
