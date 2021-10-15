package boj._1100;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1158 {
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken()) - 1;

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            idx += k;
            if (idx >= list.size()) {
                idx %= list.size();
            }
            sb.append(list.remove(idx) + ", ");
        }
        sb.append(list.remove(0));
        bw.write("<" + sb + ">");
        bw.flush();
        bw.close();
        br.close();
    }
}
