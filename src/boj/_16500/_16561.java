package boj._16500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _16561 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 1;
        int count = 2;

        for (int i = 9; i < N; i += 3) {
            sum += count;
            count += 1;
        }
        System.out.println(sum);
    }

}
