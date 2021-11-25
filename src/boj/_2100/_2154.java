package boj._2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2154 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            str.append(i);
        }
        String answer = N + "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, answer.length() + i).equals(answer)) {
                System.out.println(i + 1);
                break;
            } else if (str.length() - answer.length() == 0) {
                System.out.println(i + 1);
                break;
            }
        }
        br.close();
    }

}
