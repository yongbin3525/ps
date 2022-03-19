package boj._14600;

import java.util.Scanner;

public class _14659 {

    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                } else {
                    break;
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }

}
