package boj._2700;

import java.util.Scanner;

public class _2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T != 0) {
            int cost = sc.nextInt();

            int a = cost / 25;
            int b = (cost - a * 25) / 10;
            int c = (cost - a * 25 - b * 10) / 5;
            int d = cost - a * 25 - b * 10 - c * 5;
            System.out.println(a + " " + b + " " + c + " " + d);
            T--;
        }
    }
}
