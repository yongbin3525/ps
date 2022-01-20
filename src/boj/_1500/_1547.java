package boj._1500;

import java.util.Scanner;

public class _1547 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int cup = 1;
        for (int i = 0; i < M; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (cup == X) {
                cup = Y;
            } else if (cup == Y) {
                cup = X;
            }
        }
        System.out.println(cup);
    }

}
