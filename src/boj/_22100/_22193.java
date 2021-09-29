package boj._22100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());
        System.out.println(a.multiply(b));
    }
}
