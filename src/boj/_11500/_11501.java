package boj._11500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] stock = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                stock[j] = Integer.parseInt(st.nextToken());
            }

            long max = 0;
            long answer = 0;
            for (int j = N - 1; j >= 0; j--) {
                if (stock[j] > max) {
                    max = stock[j];
                } else {
                    answer += max - stock[j];
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

}
