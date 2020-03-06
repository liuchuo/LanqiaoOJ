#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;
struct prut{
    string MC;
    double DJ;
    int SL;
};
int main() {
    int N;
    cin >> N;
    double sum = 0.0;
    vector<prut> a(N);
    for(int i = 0; i < N; i++) {
        cin >> a[i].MC >> a[i].DJ >> a[i].SL;
        sum += a[i].DJ * a[i].SL;
    }
    printf("%lf", sum);
    return 0;
}