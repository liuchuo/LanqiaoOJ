#include <iostream>
using namespace std;
int main() {
	for(int i = 0; i < 5; i++) {
		int a[5] = {0};
		a[i] = 1;
		int sum = 0;
		if(a[0] == 0 && a[4] == 0)
			sum++;
		if(a[2] == 1 || a[4] == 1)
			sum++;
		if(a[2] == 1 || a[3] == 1)
			sum++;
		if(a[1] == 0 && a[2] == 0)
			sum++;
		if(a[4] == 0)
			sum++;
		if(sum == 2)
			cout << (char)('A' + i) << " ";
	}
	return 0;
}