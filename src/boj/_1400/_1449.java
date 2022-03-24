package boj._1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1449 {

    static int[] pipe;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        pipe = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pipe[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pipe);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                count++;
                continue;
            }

            int hole = pipe[i++];
            while (n > i) {
                if (pipe[i] - hole <= l - 1) {
                    i++;
                } else {
                    break;
                }
            }
            count++;
            i--;
        }

        System.out.println(count);
    }

}
