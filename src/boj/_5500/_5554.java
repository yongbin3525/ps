package boj._5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int sum = A + B + C + D;
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
