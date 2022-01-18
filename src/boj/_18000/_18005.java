package boj._18000;

import java.util.Scanner;

public class _18005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 == 1) {
            System.out.println(0);
        } else {
            if ((1 + N) % 2 == 1 && (N / 2) % 2 == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
