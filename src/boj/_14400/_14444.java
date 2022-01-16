package boj._14400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _14444 {

    static int[] a;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tmp = br.readLine();
        String str = "";
        int len = tmp.length();
        for (int i = 0; i < len; i++) {
            str += "#";
            str += tmp.charAt(i);
        }
        str += "#";
        a = new int[str.length()];
        manachers(str, str.length());
        int max = -1;
        for(int i : a) {
            max = Math.max(max, i);
        }
        bw.write(max);
        bw.flush();
        br.close();
        bw.close();
    }

    private static void manachers(String str, int n) {
        int p = 0;
        int r = 0;

        for (int i = 0; i < n; i++) {

            if (i <= r) {
                a[i] = Math.min(r - i, a[2 * p - i]);
            } else {
                a[i] = 0;
            }

            while (i - a[i] - 1 >= 0 && i + a[i] + 1 < n && str.charAt(i - a[i] - 1) == str.charAt(i + a[i] + 1)) {
                a[i]++;
            }
            if (r < i + a[i]) {
                r = i + a[i];
                p = i;
            }
        }
    }

}
