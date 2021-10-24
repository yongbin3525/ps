package boj._3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int row = N / 2;
        int col = N - row;
        System.out.println((row + 1) * (col + 1));
    }
}
