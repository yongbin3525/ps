package boj._1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697 {

    static int N;
    static int K;
    static int[] check = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    private static void bfs(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        check[n] = 1;

        while (!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = num + 1;
                } else if (i == 1) {
                    next = num - 1;
                } else {
                    next = num * 2;
                }

                if (next == K) {
                    System.out.println(check[num]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    queue.add(next);
                    check[next] = check[num] + 1;
                }
            }
        }
    }

}
