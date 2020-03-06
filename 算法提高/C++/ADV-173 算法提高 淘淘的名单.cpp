#include <iostream>
using namespace std;
int main() {
	int n;
	cin >> n;
	string s;
	for(int i = 0; i < n; i++) {
		cin >> s;
		if(s == "WYS") {
			cout << "KXZSMR" << endl;
		} else if(s == "CQ") {
			cout << "CHAIQIANG" << endl;
		} else if(s == "LC") {
			cout << "DRAGONNET" << endl;
		} else if(s == "SSD" || s == "LSS" || s == "LYF" || s == "SYT") {
			cout << "STUDYFATHER" << endl;
		} else {
			cout << "DENOMINATOR" << endl;
		}
	}
	return 0;
}