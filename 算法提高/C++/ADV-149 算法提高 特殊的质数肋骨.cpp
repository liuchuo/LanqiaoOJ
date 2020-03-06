#include <algorithm>
#include <map>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;
int n;
bool is(int x){
    if(x == 1 || x ==0) return  false;
    for(int i = 2; i*i <= x; i++)
        if(x % i == 0) return false;
    return true;
}
void dfs(int num, int level){
    if(level == n){
        cout << num << endl;
    }else{
        for(int i = 0; i <= 9; i++){
            if(is(num*10+i)){
                dfs(num * 10 + i, level+1);
            }
        }
    }
}
int main() {
    cin >> n;
    dfs(0,0);
    return 0;
}