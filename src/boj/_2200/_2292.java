package boj._2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int checkNum = 1;
        while (true) {
            if (num <= checkNum) {
                System.out.println(cnt);
                break;
            } else {
                checkNum += cnt++ * 6;
            }
        }
    }
}
