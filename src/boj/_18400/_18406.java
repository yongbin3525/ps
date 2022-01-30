package boj._18400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _18406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int left = 0;
        int right = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                left += array[i];
            } else {
                right += array[i];
            }
        }

        if (left == right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }

}
