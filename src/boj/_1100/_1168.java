package boj._1100;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1168 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int idx = k - 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(list.get(idx));
            list.remove(idx);
            if (list.size() == 0) {
                break;
            }
            sb.append(", ");
            idx += k - 1;
            idx %= list.size();
        }
        System.out.println("<" + sb + ">");
        br.close();
    }
}
