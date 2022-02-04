package boj._21500;

import java.util.Scanner;

public class _21591 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        boolean result = (A - C) >= 2 && (B - D) >= 2;
        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
