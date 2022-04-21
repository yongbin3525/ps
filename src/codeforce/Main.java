package codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num <= 1399) {
                System.out.println("Division 4");
            } else if (num <= 1599) {
                System.out.println("Division 3");
            } else if (num <= 1899) {
                System.out.println("Division 2");
            } else {
                System.out.println("Division 1");
            }
        }
    }

}
