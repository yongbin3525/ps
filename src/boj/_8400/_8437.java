package boj._8400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger M = new BigInteger(br.readLine());

        BigInteger A = (N.subtract(M)).divide(new BigInteger("2"));
        BigInteger B = A.add(M);

        System.out.println(B);
        System.out.println(A);
    }
}
