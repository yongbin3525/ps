package boj._2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine());
        char c = br.readLine().charAt(0);
        BigInteger m = new BigInteger(br.readLine());

        if (c == '*')
            System.out.println(n.multiply(m));
        else
            System.out.println(n.add(m));
    }
}
