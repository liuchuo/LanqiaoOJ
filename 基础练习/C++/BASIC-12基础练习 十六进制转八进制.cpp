#include <iostream>
#include <map>
using namespace std;
int main() {
    string b, s, a;
    int n;
    cin >> n;
    string arr[16] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000",
        "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
    map<string, string> m;
    m["000"] = "0"; m["001"] = "1"; m["010"] = "2"; m["011"] = "3"; m["100"] = "4";
    m["101"] = "5"; m["110"] = "6"; m["111"] = "7";
    for(int i = 0; i < n; i++) {
        cin >> s;
        int lens = s.length();
        for(int j = 0; j < lens; j++) {
            if(s[j] > '9') {
                b += arr[s[j] - 'A' + 10];
            } else {
                b += arr[s[j] - '0'];
            }
        }
        int lenb = b.length();
        if(lenb % 3 == 1) {
            b = "00" + b;
        } else if(lenb % 3 == 2) {
            b = "0" + b;
        }
        int flag = 0;
        for(int j = 0; j < lenb; j += 3) {
            string temp = b.substr(j, 3);
            string t = m[temp];
            if(j == 0 && t == "0") {
                flag = 1;
                continue;
            }
            if(flag == 1 && j == 3 && t == "0") {
                continue;
            }
            cout << t;
        }
        cout << endl;
        b = "";
    }
    return 0;
}

