package boj._23200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int K = Integer.parseInt(br.readLine()) * 23;
            sb.append(K).append("\n");
        }
        System.out.println(sb);
    }
}
