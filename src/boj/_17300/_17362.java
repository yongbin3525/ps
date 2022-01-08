package boj._17300;

import java.util.Scanner;

public class _17362 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        int change = -1;
        for (int i = 1; i < n; i++) {
            if (count <= 1) {
                change *= -1;
            }
            count += change;
            if (count >= 5) {
                change *= -1;
            }
        }
        System.out.println(count);
    }

}
