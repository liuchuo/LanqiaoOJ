#include <cstdio>
using namespace std;
int main() {
    for(int i = 1; i <= 1000; i++) {
        if(i % 11 == 0 && i % 17 == 0)
            printf("%d\n", i);
    }
    return 0;
}