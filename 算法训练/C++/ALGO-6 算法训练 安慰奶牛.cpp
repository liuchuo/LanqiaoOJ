#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int n, m, sum = 0, minn = 999999;
vector<int> u, v, w, r, p, times;
int cmp(const int i, const int j){
	return w[i] < w[j];
} 
int find(int x){
	return p[x] == x ? x : p[x] = find(p[x]);
}
void Kruskal(){
	for(int i=1;i<=n;i++)	p[i] = i;	// 初始化并查集 
	for(int i=0;i<m;i++)	r[i] = i;	// 初始化序号
	sort(r.begin(), r.end(), cmp); 
	for(int i = 0; i < m; i++){
		int e = r[i];
		int x = find(u[e]), y = find(v[e]);
		if(x != y){
			sum +=  w[e];
			p[x] = y;
		}
	}
}
int main(){
	scanf("%d%d", &n, &m);
	u.resize(m), v.resize(m), w.resize(m), r.resize(m);
	p.resize(n+1);
	times.resize(n+1);
	for(int i=1;i<=n;i++){
		scanf("%d", &times[i]);
		minn = min(minn, times[i]);
	}
	for(int i=0;i<m;i++){
		int v1, v2, l;
		scanf("%d%d%d", &v1, &v2, &l);
		u[i] = v1, v[i] = v2;
		// 将每条边的权值更新为两倍权值以及所连接的顶点所需的时间之和 
		w[i] = l*2 + times[v1] + times[v2];
	}
	Kruskal();
	printf("%d", sum + minn);
	return 0;
}
