#include <iostream>
using namespace std;
int main() {
    int mmax = INT_MIN;
    int mmin = INT_MAX;
    for(int i = 0; i < 11; i++) {
        int temp;
        cin >> temp;
        mmax = mmax > temp ? mmax : temp;
        mmin = mmin < temp ? mmin : temp;
    }
    cout << mmax << " " << mmin;
    return 0;
}