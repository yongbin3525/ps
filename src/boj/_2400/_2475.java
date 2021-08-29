package boj._2400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2475 {

    // my case
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] code = str.split(" ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(code[i]) * Integer.parseInt(code[i]);
        }
        System.out.println(sum % 10);

    }

    //other case
    public void other(){
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            cnt += Math.pow(sc.nextInt(),2);
        }
        System.out.println(cnt % 10);
    }
}
