package boj._1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");

        int A = Integer.parseInt(tmp[0]);
        int B = Integer.parseInt(tmp[1]);
        int C = Integer.parseInt(tmp[2]);

        double res = Math.sqrt(Math.pow(A, 2) / (Math.pow(B, 2) + Math.pow(C, 2)));
        System.out.print((int) Math.floor(res * B) + " ");
        System.out.println((int) Math.floor(res * C));

    }
}
