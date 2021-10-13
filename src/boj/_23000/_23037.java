package boj._23000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += Math.pow(Integer.parseInt(String.valueOf(N.charAt(i))),5);
        }
        System.out.println(sum);
    }
}
