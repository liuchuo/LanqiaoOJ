#include <iostream>
#include <vector>
using namespace std;
int main() {
    int a, b;
    cin >> a >> b;
    vector<vector<long long int> > A(a, vector<long long int>(b));
    for(int i = 0; i < a; i++)
        for(int j = 0; j < b; j++)
            cin >> A[i][j];
    int c, d;
    cin >> c >> d;
    vector<vector<long long int> > B(c, vector<long long int>(d));
    for(int i = 0; i < c; i++)
        for(int j = 0; j < d; j++)
            cin >> B[i][j];
    vector<vector<long long int> > C(a, vector<long long int>(d));
    for(int i = 0; i < a; i++) {
        for(int j = 0; j < d; j++) {
            C[i][j] = 0;
            for(int k = 0; k < b; k++)
                C[i][j] += A[i][k] + B[k][j];
            cout << C[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}