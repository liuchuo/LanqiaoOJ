#include <cstdio>
static int result = 1, m;
int n, rest, flag = 0;
void func() {
    result *= n;
    if (flag == 1 && (m - rest) % 5 == 0) 
        printf("\n");
    flag = 1;
    m--;
    printf("%12d", result);
}
int main() {
    scanf("%d%d", &n, &m);
    rest = m % 5;
    while (m != 0)
        func();
    return 0;
}