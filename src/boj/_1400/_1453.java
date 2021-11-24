package boj._1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[101];

        int backCount = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            int request = Integer.parseInt(st.nextToken());
            if (arr[request]) {
                backCount++;
            } else {
                arr[request] = true;
            }

        }

        System.out.println(backCount);
    }
}
