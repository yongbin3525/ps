package boj._1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String word = br.readLine();
            int cnt = 0;
            if (word.equals("#"))
                break;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U')
                    cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
