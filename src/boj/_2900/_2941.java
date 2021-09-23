package boj._2900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replaceAll("(c=|c-|dz=|d-|lj|nj|s=|z=)", "뀨");
        System.out.println(str.length());
    }
}
