package boj._5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            String[] arr = str.split(" ");
            int[] intArr = new int[2];
            intArr[0] = Integer.parseInt(arr[0]);
            intArr[1] = Integer.parseInt(arr[1]);
            int A = intArr[0];
            int B = intArr[1];
            if(A == 0 && B == 0) {
                break;
            }
            if (A >= B) {
                if (A % B == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else {
                if (B % A == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            }

        }
    }

}
