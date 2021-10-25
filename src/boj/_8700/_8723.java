package boj._8700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _8723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(strArr[0]);
        arr[1] = Integer.parseInt(strArr[1]);
        arr[2] = Integer.parseInt(strArr[2]);
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[1] == arr[2]) {
            System.out.println(2);
        } else if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
