package boj._1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int cnt = 1, sum = 0;

        while (true) {
            if (X <= sum + cnt) {

                if (cnt % 2 == 1) {
                    System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
                } else {
                    System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
                }
                break;

            } else {
                sum += cnt;
                cnt++;
            }
        }
    }

}
