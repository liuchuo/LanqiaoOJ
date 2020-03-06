#include <iostream>
#include <algorithm>
#include <string>
using namespace std;
int cmp(int a, int b) {
    return a < b;
}
int delnum(string s) {
    int len;
    len = s.length();
    if(len == 11) {
        return (s[7] - '0') * 1000 + (s[8] -'0') * 100 + (s[9] - '0') * 10 + (s[10] - '0');
    } else if(len == 10) {
        return (s[7] - '0') * 100 + (s[8] -'0') * 10 + (s[9] - '0');
    } else if(len == 9) {
        return (s[7] - '0') * 10 + (s[8] -'0');
    } else {
        return s[7] - '0';
    }
}
int main() {
    int n;
    cin >> n;
    int a[1500];
    for (int i = 0; i < 1500; i++)
        a[i] = 2013;
    int b[1500] = {0};
    int count = 1;
    int k = 0;
    cin.get();
    for (int i = 0; i < n; i++) {
        string s;
        getline(cin, s);
        int flag = 0;
        sort(a, a+1500, cmp);
        if (s[0] == 'N') {
            if (a[0] == 2013) {
                cout << count << endl;
                b[k++] = count;
                count++;
            } else {
                cout << a[0] << endl;
                b[k++] = a[0];
                a[0] = 2013;
            }
        } else {
            for (int l = 0; l <= k; l++) {
                if(b[l] == delnum(s)) {
                    for(int j = 0; j < 1500; j++) {
                        if (a[j] == 2013) {
                            a[j] = delnum(s);
                            cout << "Successful" << endl;
                            b[l] = 0;
                            break;
                        }
                    }
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                cout << "Failed" << endl;
            }
        }
    }
    return 0;
}

