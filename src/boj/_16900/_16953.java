package boj._16900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16953 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long answer = 1;
        while (B != A) {

            String str = String.valueOf(B);
            if (B < A || (B % 2 != 0 && str.charAt(str.length() - 1) != '1')) {
                answer = -1;
                break;
            }

            if (B % 2 == 0) {
                B >>= 1;
            } else {
                B = Long.parseLong(str.substring(0, str.length() - 1));
            }
            answer++;

        }

        System.out.println(answer);
    }

}
