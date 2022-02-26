package boj._2600;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2667 {

    static int N;
    static int[][] map;
    static int count;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static ArrayList<Integer> result;
    static boolean[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        map = new int[N][N];

        check = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String input = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        count = 0;

        result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !check[i][j]) {
                    count = 1;
                    search(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int c : result) {
            System.out.println(c);
        }
    }

    private static int search(int x, int y) {
        check[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dr[i];
            int ny = y + dc[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !check[nx][ny]) {
                    search(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }

}
