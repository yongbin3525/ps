package boj._2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        if (num[0] == num[1] && num[1] == num[2]) {
            System.out.print(10000 + num[0] * 1000);
        } else if (num[0] == num[1]) {
            System.out.print(1000 + num[0] * 100);
        } else if (num[1] == num[2]) {
            System.out.print(1000 + num[1] * 100);
        } else if (num[2] == num[0]) {
            System.out.print(1000 + num[2] * 100);
        } else {
            System.out.print(Math.max(Math.max(num[0], num[1]), num[2]) * 100);
        }

    }
}
