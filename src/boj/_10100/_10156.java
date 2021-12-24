package boj._10100;

import java.util.Scanner;

public class _10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int money = k * n - m;

        sc.close();

        System.out.println(Math.max(money, 0));
    }

}
