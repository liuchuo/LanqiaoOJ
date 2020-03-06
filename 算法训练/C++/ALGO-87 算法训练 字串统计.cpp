#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main() {
    int num;
    cin >> num;
    string a;
    cin >> a;
    vector<string> v;
    int len = a.length();
    for (int i = num; i <= len; i++) {
        for (int j = 0; j <= len - i; j++) {
            v.push_back(a.substr(j, i));
        }
    }
    
    int max = 0;
    int k = 0;
    vector<int> book(v.size());
    for (int i = 0; i <= v.size() - 1; i++) {
        for (int j = 0; j <= v.size() - 1; j++) {
            if (i != j && v[i] == v[j])
                book[i]++;
        }
    }
    
    for (int i = 0; i <= v.size() - 1; i++) {
        if (book[i] > max || (book[i] == max && v[k].length() < v[i].length())) {
            k = i;
            max = book[i];
        }
    }
    cout << v[k];
    return 0;
}