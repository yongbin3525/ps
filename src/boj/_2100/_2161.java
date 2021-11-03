package boj._2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class _2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while(q.size() != 1) {
            sb.append(Objects.requireNonNull(q.poll())).append(" ");
            q.add(q.poll());
        }
        System.out.println(sb.toString() + q.poll());
    }
}
