package boj._20600;

import java.util.Scanner;

public class _20673 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (50 >= a && 10 >= b) {
            System.out.println("White");
        } else if (30 < b) {
            System.out.println("Red");
        } else {
            System.out.println("Yellow");
        }

    }

}
