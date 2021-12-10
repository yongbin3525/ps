package boj._2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2476 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int sum = 0;
            if (one == two && two == three) {
                sum = 10000 + (one * 1000);
            } else if (one == two || one == three) {
                sum = 1000 + (one * 100);
            } else if (two == three) {
                sum = 1000 + (two * 100);
            } else {
                int max = Math.max(one, Math.max(two, three));
                sum = max * 100;
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }

}
