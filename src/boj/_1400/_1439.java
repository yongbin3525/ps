package boj._1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] a = s.split("");
        int zero = 0, one = 0;

        if (a[0].equals("0"))
            zero++;
        else
            one++;

        for (int i = 1; i < a.length; i++) {
            if (!a[i - 1].equals(a[i])) {
                if (a[i].equals("0")){
                    zero++;
                } else {
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
