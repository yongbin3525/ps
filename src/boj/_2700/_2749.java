package boj._2700;

import java.io.IOException;
import java.util.Scanner;

public class _2749 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        int pisano = 1500000;

        t = t % pisano;

        long[] fibo = new long[pisano + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= pisano; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000;
        }

        System.out.println(fibo[(int) t]);
    }
}
