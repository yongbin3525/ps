package boj._11900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int sum = 0;

        int[] total = new int[]{A, B, C, D};
        Arrays.sort(total);
        sum = total[1] + total[2] + total[3];

        int E = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        int Sum2 = Math.max(E, F);

        System.out.println(sum + Sum2);
    }

}
