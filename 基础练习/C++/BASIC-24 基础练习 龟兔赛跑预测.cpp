#include <iostream>
using namespace std;
int main() {
	int vr, vt, t, s, l;
	cin >> vr >> vt >> t >> s >> l;
	int ttime = l / vt;
	int cnttime = 0;
	int lent = 0;
	int lenr = 0;
	int breaktime = 0;//统计兔子休息的时间
	int flag = 0;//flag==0表示兔子不在休息，flag==1表示兔子正在休息
	while(lent < l && lenr < l) {
		if(flag == 0 && lenr - lent < t || flag == 1 && breaktime >= s) {
			lenr = lenr + vr;
			flag = 0;
			breaktime = 0;
		} else {
			flag = 1;
			breaktime++;
		}
		lent = lent + vt;
		cnttime++;
	}
	if(lent >= l && lenr < l) {
		cout << "T" << endl;
	} else if(lent < l && lenr >= l) {
		cout << "R" << endl;
	} else {
		cout << "D" << endl;
	}
	cout << cnttime;
	return 0;
}