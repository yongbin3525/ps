package boj._1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1699 {
    public static int d[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        d = new int[number + 1];
        //d[n] = min(d[n - i^2] + 1)
        for (int i = 1; i <= number; i++) {
            d[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (d[i] > d[i - j * j] + 1) {
                    d[i] = d[i - j * j] + 1;
                }
            }
        }
        System.out.println(d[number]);
    }
}
