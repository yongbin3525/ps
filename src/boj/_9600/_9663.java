package boj._9600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9663 {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);

    }

    public static void nQueen(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            }

            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }

    //class Main {public static void main(String[] args) {System.out.println(new int[]{0,1,0,0,2,10,4,40,92,352,724,2680,14200,73712,365596,2279184}[new java.util.Scanner(System.in).nextInt()]);}}
}
