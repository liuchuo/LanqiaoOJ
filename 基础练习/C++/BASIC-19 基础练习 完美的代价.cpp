#include <iostream>
using namespace std;
int main() {
	int n;
	cin >> n;
	string s;
	cin >> s;
	int j = n - 1;
	int cnt = 0;//cnt用来统计交换的次数
	int flag = 0;//flag判断是否已经有一个单独的奇个数的字符了
	for(int i = 0; i < j; i++) {//i指针从头遍历到倒数第二个字符
		for(int k = j; k >= i; k--) {//k指针从后面往前一直到i寻找和s[i]相同的s[k]
			if(k == i) {//如果找不到相同的
				if(n % 2 == 0 || flag == 1) {//impossible的两种情况
					cout << "Impossible";
					return 0;
				}
				flag = 1;
				cnt += n / 2 - i;
			} else if(s[k] == s[i]) {
				for(int l = k; l < j; l++) {
					swap(s[l], s[l+1]);//把s[k]换到s[j]处
					cnt++;//统计交换次数
				}
				j--;
				break;
			}
		}
	}
	cout << cnt;
	return 0;
}