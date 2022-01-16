package boj._17300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _17388 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int sum = S + K + H;
        if (sum >= 100) {
            System.out.println("OK");
        } else {
            int min = Math.min(S, K);
            min = Math.min(min, H);
            if (min == S) {
                System.out.println("Soongsil");
            } else if (min == K) {
                System.out.println("Korea");
            } else if (min == H) {
                System.out.println("Hanyang");
            }
        }
    }

}
