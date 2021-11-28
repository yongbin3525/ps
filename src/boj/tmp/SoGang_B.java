package boj.tmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoGang_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
        }

        int chapter = 0;
        Outer: while (N > chapter) {
            for (int i = 1; i < 31; i++) {
                if (arr[chapter][0] == arr[chapter][1]) {
                    if (chapter == N - 1) {
                        break Outer;
                    }
                    chapter++;
                }
                arr[chapter][1] += 1;
            }
            chapter++;
        }
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if((double)arr[i][0] / 2 <= (double)arr[i][1]) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
