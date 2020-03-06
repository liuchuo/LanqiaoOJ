#include <iostream>
using namespace std;
int add(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum = sum + arr[i];
    }
    return sum;
}

int main() {
    int n;
    cin >> n;
    int *a = new int [n];
    for (int i = 0;i < n; i++) {
        cin >> a[i];
    }
    cout << add(a, n) << " ";
    int aver = 0;
    aver = add(a, n) / n;
    cout << aver;
    delete [] a;
    return 0;
}