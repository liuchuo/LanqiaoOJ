#include <iostream>
using namespace std;
int main() {
    int N;
    cin >> N;
    int count = 0;
    for (int i = 1; i <= N; i++) {
        if (N % i == 0)
            count++;
    }
    cout << count;
}