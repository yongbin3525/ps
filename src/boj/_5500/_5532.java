package boj._5500;

import java.util.Scanner;

public class _5532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        int day = 0;
        do {
            a -= c;
            b -= d;
            day++;

        } while (a > 0 || b > 0);

        System.out.println(l - day);
    }
}
