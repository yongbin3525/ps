package boj._1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1174 {
    static ArrayList<Long> list = new ArrayList<>();
    static int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        descNum(0, 0);
        list.sort(null);
        if (N > 1023) {
            System.out.println(-1);
        } else {
            System.out.println(list.get(N - 1));
        }
    }

    private static void descNum(long sum, int idx) {
        if (!list.contains(sum)) {
            list.add(sum);
        }
        if (idx >= 10) {
            return;
        }
        descNum((sum * 10) + num[idx], idx + 1);
        descNum(sum, idx + 1);
    }
}
