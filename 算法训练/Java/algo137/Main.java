package algo137;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        P l = new P(in.nextInt(), in.nextInt(), in.nextInt());
        P e = new P(in.nextInt(), in.nextInt(), in.nextInt());
        P f = new P(in.nextInt(), in.nextInt(), in.nextInt());
        in.close();

        System.out.print(maxX(l, e, f, 1));
    }

    public static int maxX(P l, P e, P f, int x) {
        if (l.end() && e.end() && f.end()) {
            x = l.x;
            if (e.x > x) {
                x = e.x;
            }
            if (f.x > x) {
                x = f.x;
            }
            return x;
        }

        if (!l.end()) {
            if (l.canMove) {

                // move to left.
                if (l.x - l.m >= 1) {
                    l.canMove = false;
                    l.x -= l.m;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    l.canMove = true;
                }

                // move to right
                l.canMove = false;
                l.x += l.m;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                l.canMove = true;
            }

            if (l.canThrow) {
                // throw to left.
                if (l.x - l.t >= 1) {
                    l.canThrow = false;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    l.canThrow = true;
                }

                // throw to right.
                l.canThrow = false;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                l.canThrow = true;
            }
        }

        if (!e.end()) {
            if (e.canMove) {

                // move to left.
                if (e.x - e.m >= 1) {
                    e.canMove = false;
                    e.x -= e.m;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    e.canMove = true;
                }

                // move to right
                e.canMove = false;
                e.x += e.m;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                e.canMove = true;
            }

            if (e.canThrow) {
                // throw to left.
                if (e.x - e.t >= 1) {
                    e.canThrow = false;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    e.canThrow = true;
                }

                // throw to right.
                e.canThrow = false;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                e.canThrow = true;
            }
        }

        if (!f.end()) {
            if (f.canMove) {

                // move to left.
                if (f.x - f.m >= 1) {
                    f.canMove = false;
                    f.x -= f.m;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    f.canMove = true;
                }

                // move to right
                f.canMove = false;
                f.x += f.m;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                f.canMove = true;
            }

            if (f.canThrow) {
                // throw to left.
                if (f.x - f.t >= 1) {
                    f.canThrow = false;
                    int temp = maxX(l, e, f, x);
                    x = x > temp ? x : temp;
                    f.canThrow = true;
                }

                // throw to right.
                f.canThrow = false;
                int temp = maxX(l, e, f, x);
                x = x > temp ? x : temp;
                f.canThrow = true;
            }
        }
        return x;
    }
}



class P {
    int x;
    int m;  // m means movement range
    int t;  // t means throwing range
    boolean canMove;
    boolean canThrow;

    public P(int x, int m, int t) {
        this.x = x;
        this.m = m;
        this.t = t;
        this.canMove = true;
        this.canThrow = true;
    }

    public boolean end() {
        if (!canMove && !canThrow) {
            return false;
        }
        return true;
    }
}
