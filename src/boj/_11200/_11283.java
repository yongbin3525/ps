package boj._11200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();

        char result = A.charAt(0);
        System.out.println(((int)result) - 44031);
    }
}
