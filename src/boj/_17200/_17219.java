package boj._17200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            map.put(input[0], input[1]);
        }

        for (int i = 0; i < M; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }

}
