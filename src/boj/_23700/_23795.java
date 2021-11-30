package boj._23700;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _23795 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long sum = 0;
        while (true) {
            long a = Long.parseLong(br.readLine());
            if (a == -1) {
                System.out.println(sum);
                break;
            }
            sum += a;
        }
    }
}
