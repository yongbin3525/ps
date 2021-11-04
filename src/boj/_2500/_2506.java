package boj._2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String str = br.readLine();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        System.out.println(sum);

    }
}
