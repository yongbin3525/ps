package boj._16400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _16428 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n1 = new BigInteger(st.nextToken());
        BigInteger n2 = new BigInteger(st.nextToken());
        BigInteger div = n1.divide(n2);
        BigInteger rem = n1.remainder(n2);
        if (n1.compareTo(BigInteger.ZERO) == -1 && n1 != BigInteger.ZERO && n2.compareTo(BigInteger.ZERO) == 1) {
            div = div.subtract(BigInteger.ONE);
            rem = n1.subtract(n2.multiply(div));
        } else if (n1.compareTo(BigInteger.ZERO) == -1 && n1 != BigInteger.ZERO
            && n2.compareTo(BigInteger.ZERO) == -1) {
            div = div.add(BigInteger.ONE);
            rem = n1.subtract(n2.multiply(div));
        }
        System.out.println(div + "\n" + rem);
    }

}
