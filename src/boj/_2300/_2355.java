package boj._2300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2355 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.println((A + B) * (Math.max(A, B) - Math.min(A, B) + 1) / 2);
    }

}
