package boj._2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[N];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int minA = Integer.parseInt(st.nextToken()) - 1;
            int minB = Integer.parseInt(st.nextToken());
            int[] newArr = Arrays.copyOfRange(arr1, minA, minB);
            List<Integer> intList = new ArrayList<>();
            for (int element : newArr) {
                intList.add(element);
            }
            Collections.sort(intList);
            sb.append(intList.get(0));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
