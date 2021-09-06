package boj._1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        if (N < 100) {
            cnt = N;
        } else {
            cnt = 99;
            if (N == 1000) {
                N = 999;
            }

            for (int i = 100; i <= N; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
