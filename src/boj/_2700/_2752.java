package boj._2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int cnt = 0;
        while (st.hasMoreTokens()) {
            arr[cnt++] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // short coding
    // import java.util.*;class Main{public static void main(String[]a){Scanner sc = new Scanner(System.in);Arrays.stream(sc.nextLine().split(" ")).mapToInt(s->Integer.parseInt(s)).sorted().forEach(s->System.out.print(s+" "));}}
}
