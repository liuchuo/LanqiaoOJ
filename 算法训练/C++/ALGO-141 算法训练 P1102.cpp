#include <iostream>
#include <vector>
using namespace std;
struct student {
    string name;
    string sex;
    int age;
    int score;
};

int main() {
    int n;
    cin >> n;
    vector<student> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i].name >> a[i].sex >> a[i].age >> a[i].score;
    for (int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - 1 - i; j++) {
            if(a[j].score > a[j+1].score)
                swap(a[j], a[j+1]);
        }
    }
    for (int i = 0; i < n; i++)
        cout << a[i].name << " " << a[i].sex << " " << a[i].age << " " << a[i].score << endl;
    return 0;
}