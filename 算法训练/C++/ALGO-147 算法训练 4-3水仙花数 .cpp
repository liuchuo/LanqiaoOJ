#include <cstdio>
using namespace std;
int main() {
    for(int i = 1; i <= 9; i++) {
        for(int j = 0; j <= 9; j++) {
            for(int k = 0; k <= 9; k++) {
                int sum = i * i * i + j * j * j + k * k * k;
                int n = i * 100 + j * 10 + k;
                if(sum == n)
                    printf("%d%d%d\n", i, j, k);
            }
        }
    }
    return 0;
}