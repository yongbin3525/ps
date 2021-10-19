package boj._20400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a = N - (N / 100 * 22);
        int b = N - (N / 100 * 80);
        int c = N - (b / 100 * 22);
        System.out.println(a + " " + c);
    }
}
