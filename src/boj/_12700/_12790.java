package boj._12700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12790 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int hp = Math.max(Integer.parseInt(arr[0]) + Integer.parseInt(arr[4]), 1);
            int mp = Math.max(Integer.parseInt(arr[1]) + Integer.parseInt(arr[5]), 1);
            int attack = Math.max(Integer.parseInt(arr[2]) + Integer.parseInt(arr[6]), 0);
            int defense = Integer.parseInt(arr[3]) + Integer.parseInt(arr[7]);
            sb.append(hp + 5 * mp + 2 * attack + 2 * defense);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
