package boj._2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2810 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int count = 1;
        for (int i = 0; i < num; i++) {
            if (str.charAt(i) == 'S') {
                count++;
            } else if (str.charAt(i) == 'L') {
                count += 1;
                i++;
            }
        }
        System.out.println(Math.min(num, count));
    }

}
