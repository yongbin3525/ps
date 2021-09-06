package boj._5500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ham = 2000;
        int juice = 2000;
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input < ham) {
                ham = input;
            }
        }
        for (int i = 0; i < 2; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input < juice) {
                juice = input;
            }
        }
        System.out.println(ham + juice - 50);
    }
}
