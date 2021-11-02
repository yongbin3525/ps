package boj._2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if ("0".equals(str)) {
                break;
            }

            String[] num = str.split("");
            eval(num);
        }
    }

    private static void eval(String[] num) {
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            result += Integer.parseInt(num[i]);
        }

        if ((result / 10) == 0) {
            System.out.println(result);
        } else {
            eval(String.valueOf(result).split(""));
        }
    }
}
