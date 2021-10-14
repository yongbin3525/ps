package boj._23000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if (S.contains("A")) {
            S = S.replaceAll("([BCDF])", "A");
        } else if (!S.contains("A") && S.contains("B")) {
            S = S.replaceAll("([CDF])", "B");
        } else if (!S.contains("A") && !S.contains("B") && S.contains("C")) {
            S = S.replaceAll("([DF])", "C");
        } else if (!S.contains("A") && !S.contains("B") && !S.contains("C")) {
            S = S.replaceAll(".", "A");
        }
        System.out.println(S);
    }
}
