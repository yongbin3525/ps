package boj._13900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13985 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(String.valueOf(str.charAt(0)));
        int b = Integer.parseInt(String.valueOf(str.charAt(4)));
        int c = Integer.parseInt(String.valueOf(str.charAt(8)));
        if (a + b == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
