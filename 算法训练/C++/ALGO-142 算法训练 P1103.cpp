#include <iostream>
#include <cstdio>
using namespace std;
struct node {
    float a;
    float b;
};

char t;

struct node m, n, p, *q;

struct node * add() {
    p.a = m.a + n.a;
    p.b = m.b + n.b;
    q = &p;
    return q;
}

struct node * minu() {
    p.a = m.a - n.a;
    p.b = m.b - n.b;
    q = &p;
    return q;
}

struct node * multi() {
    p.a = m.a * n.a - m.b * n.b;
    p.b = m.a * n.b + m.b * n.a;
    q = &p;
    return q;
}

struct node * div() {
    p.a = (m.a * n.a + m.b * n.b) / (n.a * n.a + n.b * n.b);
    p.b = (m.b * n.a - m.a * n.b) / (n.a * n.a + n.b * n.b);
    q = &p;
    return q;
}

int main() {
    scanf("%c %f %f %f %f", &t, &m.a, &m.b, &n.a, &n.b);
    if(t == '+')
        add();
    if(t == '-')
        minu();
    if(t == '*')
        multi();
    if(t == '/')
        div();
    printf("%.2f+%.2fi", q->a, q->b);
    return 0;
}