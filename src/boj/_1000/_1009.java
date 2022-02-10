package boj._1000;

import java.util.Scanner;

public class _1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a, b, r;
        for (int j = 0; j < T; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            r = 1;

            for (int i = 0; i < b; i++) {
                r = (r * a) % 10;
            }
            if (r == 0) {
                r = 10;
            }
            System.out.println(r);
        }
    }

}
