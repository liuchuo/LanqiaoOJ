#include <iostream>
using namespace std;
bool judge(int i, int j, int k) {
    int book[10] = {0};
    book[0] = 1;
    if(i == j || j == k || i == k)
        return false;
    book[i] = 1, book[j] = 1, book[k] = 1;
    int one = i * 100 + j * 10 + k;
    int two = 2 * one;
    int three = 3 * one;
    if(two >= 666 || three >=987)
        return false;
    if(book[two/100] == 1)
        return false;
    else
        book[two/100] = 1;
    
    if(book[two/10-two/100*10] == 1)
        return false;
    else
        book[two/10-two/100*10] = 1;
    
    if(book[two%10] == 1)
        return false;
    else
        book[two%10] = 1;
    
    if(book[three/100] == 1)
        return false;
    else
        book[three/100] = 1;
    
    if(book[three/10-three/100*10] == 1)
        return false;
    else
        book[three/10-three/100*10] = 1;
    
    if(book[three%10] == 1)
        return false;
    else
        return true;
}
int main() {
    for(int i = 1; i <= 3; i++) {
        for(int j = 1; j <= 9; j++) {
            for(int k = 1; k <= 9; k++) {
                if(judge(i, j, k) == true) {
                    int one = i * 100 + j * 10 + k;
                    cout << one << " " << one * 2 << " " << one * 3 << endl;
                }
            }
        }
    }
    return 0;
}