package boj._1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class _1212 {
    public static void main(String[] a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if ("0".equals(str)) {
            System.out.println(0);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0) {
                    System.out.print(Integer.toBinaryString(Integer.parseInt(String.valueOf(str.charAt(i)))));
                } else {
                    System.out.print(func(str.charAt(i)));
                }
            }
        }
    }

    private static String func(char a) {
        String result = "";
        switch (a) {
            case '0':
                result = "000";
                break;
            case '1':
                result = "001";
                break;
            case '2':
                result = "010";
                break;
            case '3':
                result = "011";
                break;
            case '4':
                result = "100";
                break;
            case '5':
                result = "101";
                break;
            case '6':
                result = "110";
                break;
            case '7':
                result = "111";
                break;
        }
        return result;
    }

    void other() {
        System.out.println(new BigInteger(new java.util.Scanner(System.in).next(), 8).toString(2));
    }
}
