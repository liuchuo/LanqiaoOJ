#include <iostream>
#include <algorithm>
using namespace std;
int cmp1(int a, int b){return a < b;}
int cmp2(int a, int b){return a > b;}
int sum1(int a[], int b[],int n) {
    int sum = 0;
    for (int i = 0; i < n; i++){
        sum = sum + a[i] * b[i];
    }
    return sum;
}
int main() {
    int T;
    cin >> T;
    int *sum = new int [T];
    for (int i = 0; i < T; i++) {
        int n;
        cin >> n;
        int *a = new int [n];
        int *b = new int [n];
        for (int j = 0; j < n; j++) {
            cin >> a[j];
        }
        for (int j = 0; j < n; j++) {
            cin >> b[j];
        }
        sort(a, a + n, cmp1);
        sort(b, b + n, cmp2);
        sum[i] = sum1(a, b, n);
    }
    for (int i = 0; i < T; i++) {
        cout << sum[i] << endl;
    }
    delete [] sum;
    return 0;
}