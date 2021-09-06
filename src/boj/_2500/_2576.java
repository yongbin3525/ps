package boj._2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[7];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);
            }
        }
        if (list.size() > 0) {
            list.sort(Comparator.naturalOrder());
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        } else {
            System.out.println(-1);
        }

    }
}
