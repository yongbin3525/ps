package boj._1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[] num = new int[10];
        int sixOrNine = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 6 || array[i] == 9) {
                sixOrNine++;
            } else {
                num[array[i]]++;
            }
        }
        num[6] = sixOrNine / 2;
        num[9] = sixOrNine / 2 + sixOrNine % 2;
        System.out.println(Arrays.stream(num).max().getAsInt());
    }

}
