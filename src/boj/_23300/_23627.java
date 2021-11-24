package boj._23300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class _23627 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String pattern = "^.*driip$";
        if (Pattern.matches(pattern, str)) {
            System.out.println("cute");
        } else {
            System.out.println("not cute");
        }
    }
}
