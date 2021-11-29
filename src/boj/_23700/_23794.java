package boj._23700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23794 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        N += 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
