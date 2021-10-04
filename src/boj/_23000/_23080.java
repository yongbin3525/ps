package boj._23000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i += K) {
            sb.append(S.charAt(i));
        }
        System.out.println(sb);
    }
}
