package boj.tmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2022_ICPC_A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            String str = br.readLine().replace("for", "쁇").replace("while", "쁈");
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals("쁇") || String.valueOf(str.charAt(j)).equals("쁈")) {
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }
        System.out.println(max);
    }

}
