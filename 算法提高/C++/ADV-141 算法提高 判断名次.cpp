#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <cmath>
using namespace std;
string ranks = "ABCDE";
vector<string> say(5);
int cnt;
bool check(string s) {
    int hash[150] = {0};
    for (int i = 0; i < 5; i++)
        hash[s[i]] = i + 1;
    for (int i = 0; i < 5; i++) {
        string sayt = say[i];
        int len = sayt.length();
        if (hash['A' + i] % 2 == 1) {
            if (sayt[1] == '=' && hash[sayt[0]] == sayt[len - 1] - '0') return false;
            if (sayt[1] == '!' && hash[sayt[0]] != sayt[len - 1] - '0') return false;
            if (len == 3 && sayt[1] == '<' && hash[sayt[0]] < sayt[len - 1] - '0') return false;
            if (len == 3 && sayt[1] == '>' && hash[sayt[0]] > sayt[len - 1] - '0') return false;
            if (len == 4 && sayt[1] == '>' && hash[sayt[0]] >= sayt[len - 1] - '0') return false;
            if (len == 4 && sayt[1] == '<' && hash[sayt[0]] <= sayt[len - 1] - '0') return false;
        } else {
            if (sayt[1] == '=' && hash[sayt[0]] != sayt[len - 1] - '0') return false;
            if (sayt[1] == '!' && hash[sayt[0]] == sayt[len - 1] - '0') return false;
            if (len == 3 && sayt[1] == '<' && hash[sayt[0]] >= sayt[len - 1] - '0') return false;
            if (len == 3 && sayt[1] == '>' && hash[sayt[0]] <= sayt[len - 1] - '0') return false;
            if (len == 4 && sayt[1] == '>' && hash[sayt[0]] < sayt[len - 1] - '0') return false;
            if (len == 4 && sayt[1] == '<' && hash[sayt[0]] > sayt[say[i].length() - 1] - '0') return false;
        }
    }
    cnt++;
    return true;
}
int main() {
    for (int i = 0; i < 5; i++)
        cin >> say[i];
    do {
        if (check(ranks)) cout << ranks << endl;
    } while (next_permutation(ranks.begin(), ranks.end()));
    cout << cnt;
    return 0;
}