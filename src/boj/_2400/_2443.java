package boj._2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int star = Integer.parseInt(br.readLine());

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (2 * star) - (i * 2 - 1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
