package boj._1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class _1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String pattern = "(100+1+|01)+";
        for(int i = 0 ; i < N; i++){
            String str = br.readLine();
            if(Pattern.matches(pattern, str)){
                sb.append("YES").append("\n");
            }else {
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}
