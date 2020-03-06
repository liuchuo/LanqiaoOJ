#include <iostream>
using namespace std;
int isleapyear(int year);
int days(int year, int month, int day);
int distance(int year, int month, int day);
int main() {
    int year, month, day;
    cin >> year >> month >> day;
    int distance1 = distance(year, month, day);
    if (year >= 2012) {
        switch(distance1) {
            case 0: cout << 6; break;
            case 1: cout << 7; break;
            case 2: cout << 1; break;
            case 3: cout << 2; break;
            case 4: cout << 3; break;
            case 5: cout << 4; break;
            case 6: cout << 5; break;
        }
    } else {
        switch(distance1) {
            case 0: cout << 6; break;
            case 1: cout << 5; break;
            case 2: cout << 4; break;
            case 3: cout << 3; break;
            case 4: cout << 2; break;
            case 5: cout << 1; break;
            case 6: cout << 7; break;
        }
    }
    return 0;
}

int isleapyear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        return 1;
    else
        return 0;
}

int days(int year, int month, int day) {
    int sum = 0;
    if (month <= 2) {
        if (month == 1)
            sum = day;
        else
            sum = 31 + day;
    } else {
        switch(month) {
            case 3: sum = 59 + day; break;
            case 4: sum = 90 + day; break;
            case 5: sum = 120 + day; break;
            case 6: sum = 151 + day; break;
            case 7: sum = 181 + day; break;
            case 8: sum = 212 + day; break;
            case 9: sum = 243 + day; break;
            case 10: sum = 273 + day; break;
            case 11: sum = 304 + day; break;
            case 12: sum = 334 + day; break;
        }
        if(isleapyear(year) == 1) {
            sum = sum + 1;
        }
    }
    return sum;
}
int distance(int year, int month, int day) {
    int count = 0;
    int distance1 = 0;
    if(year >=2012) {
        distance1 = 365 * (year - 2012) + days(year, month, day);
        for (int i = 2012; i < year; i++) {
            if(isleapyear(i) == 1)
                count++;
        }
        distance1 = distance1 + count;
    } else {
        distance1 = 365 * (2011 - year) + 365 - days(year, month, day);
        if (isleapyear(year) == 1)
            distance1 = distance1 + 1;
        for (int i = year + 1; i <= 2011; i++) {
            if(isleapyear(i) == 1)
                count++;
        }
        distance1 = distance1 + count;
    }
    distance1 = distance1 % 7;
    return distance1;
}
