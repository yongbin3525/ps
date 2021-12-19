package boj._5600;

import java.util.Scanner;

public class _5612 {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = m;
        for (int i = 0; i < n; i++) {
            int plus = sc.nextInt();
            int minus = sc.nextInt();

            m = m + plus - minus;
            if (m < 0) {
                max = 0;
                break;
            }

            if (m > max) {
                max = m;
            }
        }
        System.out.println(max);
    }

}
