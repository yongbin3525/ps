package boj._15400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N * (N - 1));
    }
}
