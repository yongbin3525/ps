package boj._1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if ("0".equals(str)) {
                break;
            }
            int cnt = 2;
            cnt += str.length() - 1;
            for (int i = 0; i < str.length(); i++) {
                if ("1".equals(String.valueOf(str.charAt(i)))) {
                    cnt += 2;
                } else if ("0".equals(String.valueOf(str.charAt(i)))) {
                    cnt += 4;
                } else {
                    cnt += 3;
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

    }
}
