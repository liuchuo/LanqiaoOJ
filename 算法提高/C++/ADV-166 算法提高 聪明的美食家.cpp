#include <iostream>
using namespace std;
#define max(a, b) (a) > (b) ? (a) : (b)
int main() {
    int n;
    cin >> n;
    int *a = new int [n];
    int *b = new int [n];
    for(int i = 0; i < n; i++)
        cin >> a[i];
    b[0] = 1;
    int ans = 1;
    for(int i = 0; i < n; i++) {
        int maxvalue = 0;
        for(int j = i-1; j >= 0; j--) {
            if(a[i] >= a[j])
                maxvalue = max(maxvalue, b[j]);
        }
        b[i] = maxvalue + 1;
        ans = max(ans, b[i]);
    }
    cout << ans;
    return 0;
}