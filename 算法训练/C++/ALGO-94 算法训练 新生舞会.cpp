#include <iostream>
#include <map>
using namespace std;
int main() {
    map<string, string> sex;
    map<string,string> id_name;
    int n,k;
    cin >> n;
    for(int i = 0; i < n; i++){
        string id, name, tsex;
        cin >> id >> name >> tsex;
        id_name[id] = name;
        id_name[name] = id;
        sex[id] = sex[name] = tsex;
    }
    cin >> k;
    for(int i = 0; i < k; i++){
        string s1 , s2;
        cin >> s1 >> s2;
        if(id_name[s1] != s2 && sex[s1] != sex[s2]) cout << "Y\n";
        else cout << "N\n";
    }
    return 0;
}