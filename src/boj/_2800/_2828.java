package boj._2800;

import java.util.Scanner;

public class _2828 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int move = 0;

        int left = 0;
        int right = (m - 1);

        for (int i = 0; i < t; i++) {
            int tmp = sc.nextInt() - 1;
            if (tmp > right) {
                move += tmp - right;
                right = tmp;
                left = tmp - (m - 1);
            } else if (tmp < left) {
                move += left - tmp;
                left = tmp;
                right = tmp + (m - 1);
            }
        }
        System.out.println(move);
    }

}
