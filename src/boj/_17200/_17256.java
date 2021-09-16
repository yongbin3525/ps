package boj._17200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int[] arr3 = new int[3];
        int[] arr4 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = Integer.parseInt(arr1[i]);
            arr4[i] = Integer.parseInt(arr2[i]);
        }
        int bx = arr4[0] - arr3[2];
        int by = arr4[1] / arr3[1];
        int bz = arr4[2] - arr3[0];
        System.out.println(bx + " " + by + " " + bz);
    }
}
