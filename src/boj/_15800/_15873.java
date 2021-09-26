package boj._15800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int res = (num / 10) + (num % 10);

        if (num / 10 > 10) {
            res = (num / 100) + (num % 100);
        }

        if (num == 1010) {
            res = 20;
        }

        System.out.println(res);
    }
}
