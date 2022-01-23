package boj._5500;

import java.util.Scanner;

public class _5585 {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000 - sc.nextInt();
        int[] coinType = {500, 100, 50, 10, 5, 1};

        for (int coin : coinType) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }

}
