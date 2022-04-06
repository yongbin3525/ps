package boj._14400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _14487 {

    public static void main(String[] args) throws IOException {
        int cnt;
        int[] arr;
        int max = 0;
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cnt = Integer.parseInt(br.readLine());

        arr = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result += arr[i];

            if (max == 0) {
                max = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        result -= max;
        System.out.println(result);
    }
}
