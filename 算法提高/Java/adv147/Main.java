package adv147;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by JoyHwong on 16/3/8.
 * copyright @ 2016 All right reserved.
 * follow me on github https://github.com/JoyHwong
 */
public class Main {

    public static int isVisited[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        char[][] maze = new char[n][m];
        isVisited = new int[n][m];
        for (int i = 0; i < n; i++) {
            maze[i] = in.next().toCharArray();
        }
        in.close();

        Queue<Index> queue = new LinkedList<>();
        queue.add(new Index(0, 0));
        Index e = new Index(n-1, m-1);
        isVisited[0][0] = 1;
        bfs(maze, queue, e);
        printPath(n-1, m-1, n, m);
    }

    public static void bfs(char[][] maze, Queue<Index> q, Index e) {
        Queue<Index> queue = new LinkedList<>();

        while (!q.isEmpty()) {
            Index s = q.poll();

            if (s.equals(e)) {
                System.out.println(isVisited[s.r][s.l] - 1);
                return;
            }

            // Down
            if (s.r + 1 <= e.r && isVisited[s.r + 1][s.l] == 0 && maze[s.r+1][s.l] == '0') {
                queue.add(new Index(s.r + 1, s.l));
                isVisited[s.r+1][s.l] = isVisited[s.r][s.l] + 1;
            }

            // Left
            if (s.l >= 1 && isVisited[s.r][s.l - 1] == 0 && maze[s.r][s.l - 1] == '0') {
                queue.add(new Index(s.r, s.l - 1));
                isVisited[s.r][s.l - 1] = isVisited[s.r][s.l] + 1;
            }

            // Right
            if (s.l + 1 <= e.l && isVisited[s.r][s.l + 1] == 0 && maze[s.r][s.l + 1] == '0') {
                queue.add(new Index(s.r, s.l+1));
                isVisited[s.r][s.l + 1] = isVisited[s.r][s.l] + 1;
            }

            // Up
            if (s.r >= 1 && isVisited[s.r - 1][s.l] == 0 && maze[s.r - 1][s.l] == '0') {
                queue.add(new Index(s.r - 1, s.l));
                isVisited[s.r - 1][s.l] = isVisited[s.r][s.l] + 1;
            }
        }

        bfs(maze, queue, e);
    }

    public static void printPath(int r, int l, int n, int m) {
        if (r == 0 && l == 0) {
            return;
        }

        if (r+1 < n && isVisited[r][l] - 1 == isVisited[r+1][l]) {
            // Down
            printPath(r+1, l, n, m);
            System.out.print("U");
        } else if (l>=1 && isVisited[r][l] - 1 == isVisited[r][l-1]) {
            // Left
            printPath(r,l-1, n, m);
            System.out.print("R");
        } else if (l +1 < m && isVisited[r][l] - 1 == isVisited[r][l+1]) {
            // Right
            printPath(r, l+1, n, m);
            System.out.print("L");
        } else if (r >= 1 && isVisited[r][l] - 1 == isVisited[r-1][l]) {
            // Up
            printPath(r-1, l, n, m);
            System.out.print("D");
        }
    }


}

class Index {
    int r;
    int l;

    public Index (int r, int l) {
        this.r = r;
        this.l = l;
    }

    public boolean equals(Index e) {
        return r == e.r && l == e.l;
    }

}
