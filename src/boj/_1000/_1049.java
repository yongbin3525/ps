package boj._1000;

import java.util.Arrays;
import java.util.Scanner;

public class _1049 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int min;

        int[] unit = new int[M];
        int[] pack = new int[M];
        for (int i = 0; i < M; i++) {
            pack[i] = sc.nextInt();
            unit[i] = sc.nextInt();
        }
        Arrays.sort(unit);
        Arrays.sort(pack);

        min = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
        min = Math.min(min, ((N / 6)) * pack[0] + (N % 6) * unit[0]);

        System.out.println(min);
    }

}
