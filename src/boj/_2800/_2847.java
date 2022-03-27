package boj._2800;

import java.util.Scanner;

public class _2847 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[i + 1]) {
                int tmp = arr[i] - arr[i + 1] + 1;
                answer += tmp;
                arr[i] -= tmp;
            }
        }
        System.out.println(answer);
    }

}
