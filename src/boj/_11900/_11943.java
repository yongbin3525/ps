package boj._11900;

import java.util.Scanner;

public class _11943 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int res = Math.min(A + D, B + C);
        System.out.println(res);
    }

}
