package boj._1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1422 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static int max;
    static String[] numList;
    static String answer = "";

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        numList = new String[K];
        for (int i = 0; i < K; i++) {
            String str = br.readLine();
            int value = Integer.parseInt(str);
            if (max < value){
                max = value;
            }
            numList[i] = str;
        }

        Arrays.sort(numList, (o1, o2) -> {
            String o = o1 + o2;
            return -o.compareTo(o2 + o1);
        });
        boolean flag = false;
        for (int i = 0; i < K; i++) {
            answer += numList[i];
            if (max == Integer.parseInt(numList[i]) && !flag) {
                flag = true;
                for (int j = 0; j < (N - K); j++) {
                    answer += numList[i];
                }
            }
        }
        System.out.println(answer);
    }
}

