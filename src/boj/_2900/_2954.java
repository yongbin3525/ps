package boj._2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("([a|e|i|o|u])p([a|e|i|o|u])", "$1");
        System.out.println(str);
    }
}
