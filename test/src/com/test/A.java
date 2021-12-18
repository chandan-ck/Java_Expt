package com.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class A {
	// Class for storing a Point's data
    static class Point {
        int x, y;
        int dis;

        public Point(int x, int y, int dis)
        {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    // Utility method returns true if (x, y) lies
    // inside Board
    static boolean isInside(int x, int y, int N)
    {
        if (x >= 0 && x < N && y >= 0 && y < N)
            return true;
        return false;
    }
	
	public static int minMoves(int n, int startRow, int startCol, int endRow, int endCol) {

        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        int minDistance = Integer.MAX_VALUE;
        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(startRow, startCol,0));

        Point t;
        int x, y;
        boolean visit[][] = new boolean[n][n];
        // make all Point unvisited
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                visit[i][j] = false;

        visit[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            t = queue.poll();

            if (t.x == endRow && t.y == endCol){
                if(minDistance > t.dis)
                minDistance =  t.dis;
            }
            for (int i = 0; i < 8; i++) {
                x = t.x + dx[i];
                y = t.y + dy[i];

                // If reachable state is not yet visited and
                // inside board, push that state into queue
                if (isInside(x, y, n) && !visit[x][y]) {
                    visit[x][y] = true;
                    queue.add(new Point(x, y, t.dis + 1));
                }
            }
        }
        return minDistance == Integer.MAX_VALUE? -1:minDistance;
    }
    // Driver code
    public static void main(String[] args)
    {
        System.out.println( minMoves(7, 6, 6, 1,0));
    }
}
