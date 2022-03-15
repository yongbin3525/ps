package boj._1700;

import java.util.Scanner;

public class _1789 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sum = 0;
        int count = 0;

        for (int i = 1; sum < num; i++) {
            sum += i;
            count++;
        }
        System.out.println(count - 1);
        sc.close();
    }

}
