package boj._10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] n = new int[26];
        for (int i = 0; i < s.length(); i++) {
            n[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
