#include <iostream>
#include <cmath>
using namespace std;
int main() {
    double n, ans;
    cin >> n;
    ans = n * 950 / 3.0;
    if(ans == 0) {
        printf("0.000000E+000");
    } else if (ans >= 1){
        int num = log10(ans);
        printf("%6fE+%03lld",ans/pow(10,num),23+num);
    }else{
        int num = log10(ans)*-1 + 1;
        printf("%6fE+%03lld",ans*pow(10,num),23-num);
    }
    return 0;
}