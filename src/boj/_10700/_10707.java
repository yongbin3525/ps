package boj._10700;

import java.io.IOException;
import java.util.Scanner;

public class _10707 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int P = scan.nextInt();

        for (int i = 0; i < (Math.max(P - C, 0)) ; i++) {
            B += D;
        }

        System.out.println(Math.min((A * P), B));
    }
}
