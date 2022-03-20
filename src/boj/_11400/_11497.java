package boj._11400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _11497 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int max = 0;
            int[] arr = new int[N];
            for (int n = 0; n < N; n++) {
                arr[n] = sc.nextInt();
            }
            Arrays.sort(arr);

            for (int i = 0; i < N; i++) {
                if (i + 2 < N) {
                    max = Math.max(max, arr[i + 2] - arr[i]);
                }
            }
            System.out.println(max);
        }
    }

}
