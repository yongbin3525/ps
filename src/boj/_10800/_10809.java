package boj._10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10809 {
    // my case
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);
        for (int i = 0; i < str.length(); i++) {
            if (alpha[(int) str.charAt(i) - 97] == -1) {
                alpha[(int) str.charAt(i) - 97] = i;
            }
        }
        for (int a : alpha) {
            System.out.print(a + " ");
        }
    }

    // other case
    public void other() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
