package boj._1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bird = 1;
        int count = 0;

        while (n >= 1) {
            if (n < bird) {
                bird = 1;
            }
            n -= bird;
            bird++;
            count++;
        }

        System.out.println(count);
    }
}
