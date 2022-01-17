package boj._11500;

import java.util.Scanner;

public class _11549 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == t) {
                result += 1;
            }
        }
        System.out.println(result);
    }

}
