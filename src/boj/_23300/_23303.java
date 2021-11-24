package boj._23300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.toLowerCase().contains("d2")) {
            System.out.println("D2");
        } else {
            System.out.println("unrated");
        }
    }
}
