package boj._15600;

import java.util.Arrays;
import java.util.Scanner;

public class _15657 {

    private static int n, m;
    private static int[] map;
    private static int[] result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n];
        result = new int[m];

        for (int i = 0; i < n; i++) {
            map[i] = sc.nextInt();
        }

        Arrays.sort(map);

        StringBuilder sb = new StringBuilder();

        cycle(0, 0, sb);

        System.out.println(sb);

    }

    private static void cycle(int start, int cnt, StringBuilder sb) {
        if (cnt == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
        } else {
            for (int i = start; i < n; i++) {
                result[cnt] = map[i];
                cycle(i, cnt + 1, sb);
            }

        }

    }

}
