package boj._1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1138 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tall = new int[n + 1];
        List<Integer> ans = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            tall[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = n; i >= 1; i--) {
            ans.add(tall[i], i);
        }

        for (int k : ans) {
            System.out.print(k + " ");
        }
    }

}
