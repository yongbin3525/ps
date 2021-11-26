package boj._1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1592 {
    static int N, M, L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        int cnt = 0;
        int index = 0;
        while (true) {
            arr[index]++;
            if (arr[index] == M)
                break;

            if (arr[index] % 2 == 0) {
                if (index + L >= N) {
                    index = L - N + index;
                } else {
                    index += L;
                }
            } else if (arr[index] % 2 == 1) {
                if (index - L < 0) {
                    index = N - L + index;
                } else
                    index -= L;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
