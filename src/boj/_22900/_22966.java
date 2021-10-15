package boj._22900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, String> map = new HashMap<>();
        int min = 5;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());
            map.put(grade, name);
            if (min > grade) {
                min = grade;
            }
        }
        System.out.println(map.get(min));
    }
}
