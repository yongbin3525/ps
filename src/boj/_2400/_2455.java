package boj._2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2455 {

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int boardingNum = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());

            if (out == 0) {
                boardingNum = in;
            } else {
                boardingNum = boardingNum - out + in;
            }
            count = Math.max(count, boardingNum);

        }

        System.out.println(count);
    }
}
