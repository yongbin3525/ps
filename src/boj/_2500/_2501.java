package boj._2500;

import java.util.Scanner;

public class _2501 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                arr[i] = i;
            }
        }
        System.out.println(arr[K]);

    }

}
