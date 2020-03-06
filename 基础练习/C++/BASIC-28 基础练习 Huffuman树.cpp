#include <iostream>
#include <vector>
#include <algorithm>
int cmp1(int a, int b) {
    return a > b;
}
using namespace std;
int main() {
    int n;
    int price = 0;
    vector<int> v;
    cin >> n;
    for(int i = 0; i < n; i++) {
        int temp;
        cin >> temp;
        v.push_back(temp);
    }
    int size = v.size();

    while(size >= 2) {
        sort(v.begin(), v.end(), cmp1);
        int t = v[size-1] + v[size-2];
        price += t;
        v.pop_back();
        v.pop_back();
        v.push_back(t);
        size = v.size();
    }
    cout << price;
    return 0;
}