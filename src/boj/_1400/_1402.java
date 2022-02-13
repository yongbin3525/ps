package boj._1400;

import java.util.Scanner;

public class _1402 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tCase = scan.nextInt();
        for (int i = 0; i < tCase; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int[] arr = new int[a];
            int temp = 2;
            int t = 0;
            while (a != 1) {
                if (a % temp == 0) {
                    arr[t] = temp;
                    a = a / temp;
                    t++;
                } else {
                    temp++;
                }
            }
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 0) {
                    break;
                }
                sum += arr[j];
            }
            System.out.println(sum);
            if (sum == b) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

}
