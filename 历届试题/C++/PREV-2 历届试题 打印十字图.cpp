#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int row = 9 + 4 * (n - 1);
    
    //init
    char a[150][150];
    for(int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            a[i][j] = '.';
        }
    }
    int mid = row / 2 + 1;
    //中间十字架
    for (int i = mid - 2; i <= mid + 2; i++) {
        a[i][mid] = '$';
        a[mid][i] = '$';
    }
    
    //边框十字架
    int tn = n;
    while (tn != 0) {
        int trow = 9 + 4 * (tn - 1);
//        第一行和最后一行，第一列和最后一列
        for (int i = mid - 2 * tn; i <= mid + 2 * tn; i++) {
            a[mid - 2 * (tn + 1)][i] = '$';
            a[mid + 2 * (tn + 1)][i] = '$';
            a[i][mid - 2 * (tn + 1)] = '$';
            a[i][mid + 2 * (tn + 1)] = '$';
        }
        
        //第二行和倒数第二行，第二列和倒数第二列
        a[mid - 2 * tn - 1][mid - 2 * tn] = '$';
        a[mid - 2 * tn - 1][mid + 2 * tn] = '$';
        a[mid - 2 * tn][mid - 2 * tn - 1] = '$';
        a[mid + 2 * tn][mid - 2 * tn - 1] = '$';
        
        a[mid + 2 * tn + 1][mid - 2 * tn] = '$';
        a[mid + 2 * tn + 1][mid + 2 * tn] = '$';
        a[mid - 2 * tn][mid + 2 * tn + 1] = '$';
        a[mid + 2 * tn][mid + 2 * tn + 1] = '$';
        
        //四个拐弯的角
        a[mid - 2 * tn][mid - 2 * tn] = '$';
        a[mid - 2 * tn][mid + 2 * tn] = '$';
        a[mid + 2 * tn][mid - 2 * tn] = '$';
        a[mid + 2 * tn][mid + 2 * tn] = '$';
        
        //上一层
        tn--;
    }
    
    
    //输出
    for (int i = 1; i <= row; i++) {
        for (int j = 1; j <= row; j++) {
            cout << a[i][j];
        }
        cout << endl;
    }
    return 0;
}
