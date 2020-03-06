#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int *a = new int[n];
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for(int i = 0; i < n; i++) {
        int k = i;
        for(int j = i + 1; j < n; j++) {
            if(a[j] < a[k])
                k = j;
        }
        swap(a[i], a[k]);
        printf("swap(a[%d], a[%d]):", i, k);
        for(int m = 0; m < n; m++) {
            printf("%d ", a[m]);
        }
        cout << endl;
    }
    delete [] a;
    return 0;
}