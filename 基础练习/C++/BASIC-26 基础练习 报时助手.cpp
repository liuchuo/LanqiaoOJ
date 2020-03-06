#include <iostream>
using namespace std;
int main() {
    int h, m;
    cin >> h >> m;
    string arr[24] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
					"fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three"};
	cout << arr[h] << " ";
    if (m == 0)
        cout << "o'clock";
    int t = m % 10;
    m = m / 10;
    switch(m) {
        case 2: cout << "twenty "; break;
        case 3: cout << "thirty "; break;
        case 4: cout << "forty "; break;
        case 5: cout << "fifty "; break;
        default: break;
    }
    if (m == 0 && t != 0) {
        cout << arr[t];
    }
    if (m == 1) {
        cout << arr[t + 10];
    }
    if (m != 0 && m != 1 && t!= 0) {
        cout << arr[t];
    }
    return 0;
}