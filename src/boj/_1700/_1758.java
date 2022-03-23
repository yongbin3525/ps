package boj._1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1758 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tip = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            tip[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tip);
        int j = tip.length;
        long total_tip = 0;

        for (int i = 1; i <= N; i++) {
            int want_tip = tip[j - 1] - (i - 1);
            if (want_tip < 0) {
                break;
            }
            total_tip += want_tip;
            j--;
        }

        System.out.println(total_tip);

    }

}
