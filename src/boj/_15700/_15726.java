package boj._15700;

import java.util.Scanner;

public class _15726 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        System.out.println(Math.max((int) (a * b / c), (int) (a / b * c)));
    }

}
