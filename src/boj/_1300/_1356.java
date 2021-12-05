package boj._1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1356 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charArr = str.toCharArray();
        int len = str.length();

        int[] a = new int[len];
        int[] b = new int[len];
        for(int i = 0; i < len - 1; i++) {
            int j = len - 1 - i;

            if(i == 0) {
                a[i] = charArr[i] - '0';
                b[j] = charArr[j] - '0';
                continue;
            }

            a[i] = a[i - 1] * (charArr[i] - '0');
            b[j] = b[j + 1] * (charArr[j] - '0');
        }

        boolean yujinsu = false;
        for(int i = 0; i < len - 1; i++) {
            if(a[i] == b[i + 1]) {
                yujinsu = true;
                break;
            }
        }

        String result = yujinsu ? "YES" : "NO";
        System.out.print(result);
    }
}
