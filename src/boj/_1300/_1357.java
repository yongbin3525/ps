package boj._1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int x = Rev(X);
        int y = Rev(Y);
        int res = Rev(x + y);
        System.out.println(res);
    }

    private static int Rev(int N) {
        StringBuilder str = new StringBuilder();
        while (N > 0) {
            str.append(N % 10);
            N /= 10;
        }
        return Integer.parseInt(str.toString());
    }

}
