package boj._1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] array = new String[N];
        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        boolean isSame;
        for (int i = 0; i < array[0].length(); i++) {
            char c = array[0].charAt(i);

            isSame = true;
            for (int j = 1; j < N; j++) {
                if (c != array[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                sb.append(c);
            } else
                sb.append('?');
        }
        System.out.println(sb.toString());
    }
}
