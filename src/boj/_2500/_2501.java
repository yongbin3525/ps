package boj._2500;

import java.util.Scanner;

public class _2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
            }

            if (K == 0) {
                System.out.println(i);
                break;
            }
        }
        if (K != 0) {
            System.out.println(0);
        }
    }

}
