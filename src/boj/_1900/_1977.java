package boj._1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = (int) Math.ceil(Math.sqrt(m));
        int sum = 0;
        for (int i = min; i <= Math.floor(Math.sqrt(n)); i++) {
            sum += Math.pow(i, 2);
        }
        if (sum > 0) {
            System.out.println(sum);
            System.out.println((int) Math.pow(min, 2));
        } else {
            System.out.println(-1);
        }

    }
}
