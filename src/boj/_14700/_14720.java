package boj._14700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14720 {

    static int status;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] milk = new int[N];

        for (int i = 0; i < N; i++) {
            milk[i] = Integer.parseInt(st.nextToken());
        }
        long answer = 0;
        status = 0;
        for (int i = 0; i < N; i++) {
            if (milk[i] == status) {
                changeStatus();
                answer++;
            }
        }

        System.out.println(answer);
    }

    private static void changeStatus() {
        if (status == 2) {
            status = 0;
        } else {
            status++;
        }
    }

}
