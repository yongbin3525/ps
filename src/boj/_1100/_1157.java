package boj._1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class _1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[26];
        int max = 0;
        int cnt = 0;
        int maxAlphabet = 0;

        String S = br.readLine().toUpperCase(Locale.ROOT);

        for (int i = 0; i < S.length(); i++) {
            array[S.charAt(i) - 'A']++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxAlphabet = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                cnt++;
            }
        }
        System.out.println((cnt != 1) ? "?" : (char) ('A' + maxAlphabet));

    }
}
