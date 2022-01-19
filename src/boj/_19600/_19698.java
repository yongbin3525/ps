package boj._19600;

import java.util.Scanner;

public class _19698 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int l = sc.nextInt();

        w /= l;
        h /= l;

        System.out.println(Math.min(w * h, n));
    }

}
