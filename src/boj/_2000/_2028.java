package boj._2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2028 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            String pow = String.valueOf((int)Math.pow(A, 2));
            if (String.valueOf(A).equals(pow.substring(pow.length() - String.valueOf(A).length()))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
