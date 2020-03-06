#include <iostream>
#define max(a, b) a > b ? a : b;
using namespace std;

struct node {
    int l;
    int r;
    int maxvalue;
    int sum;
} a[1000000];

void init(int left, int right, int i) {
    a[i].l = left;
    a[i].r = right;
    a[i].maxvalue = 0;
    a[i].sum = 0;
    if(left != right) {
        int mid = (left + right) / 2;
        init(left, mid, 2 * i);
        init(mid + 1, right, 2*i+1);
    }
}

void insert(int i, int j, int value) {
    if(j >= a[i].l && j <= a[i].r) {
        a[i].maxvalue = value;
        a[i].sum = value;
    }
    if(a[i].l == a[i].r)
        return ;
    int mid = (a[i].l + a[i].r) / 2;
    if(j <= mid)
        insert(2 * i, j, value);
    else
        insert(2 * i + 1, j, value);
    a[i].maxvalue = max(a[2*i].maxvalue, a[2*i+1].maxvalue);
    a[i].sum = a[2*i].sum + a[2*i+1].sum;
}

int find_sum(int i, int x, int y) {
    if(x == a[i].l && y == a[i].r) {
        return a[i].sum;
    }
    int mid = (a[i].l + a[i].r) / 2;
    if(y <= mid)
        return find_sum(2*i, x, y);
    else if(x > mid)
        return find_sum(2*i+1, x, y);
    else
        return find_sum(2*i, x, mid)+ find_sum(2*i+1, mid+1, y);
}

int find_max(int i, int x, int y) {
    if(x == a[i].l && y == a[i].r) {
        return a[i].maxvalue;
    }
    int mid = (a[i].l + a[i].r) / 2;
    if(y <= mid)
        return find_max(2*i, x, y);
    else if(x > mid)
        return find_max(2*i+1, x, y);
    else
        return max(find_max(2*i, x, mid), find_max(2*i+1, mid+1, y));
}


int main() {
    int n, m;
    cin >> n >> m;
    init(1, n, 1);
    int value;
    for(int j = 1; j <= n; j++) {
        cin >> value;
        insert(1, j, value);
    }
    for(int k = 0; k < m; k++) {
        int p, x, y;
        cin >> p >> x >> y;
        if(p == 1)
            insert(1, x, y);
        if(p == 2)
            cout << find_sum(1, x, y) << endl;
        if(p == 3)
            cout << find_max(1, x, y) << endl;
    }
    return 0;
}