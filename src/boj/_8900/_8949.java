package boj._8900;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _8949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        String A = st.nextToken();
        String B = st.nextToken();
        if(A.length() != B.length()) {
                while(A.length() != B.length()) {
                   if(B.length() > A.length()) {
                       A = "0" + A;
                   }else if(B.length() < A.length()) {
                       B = "0" + B;
                   }
                }
        }
        for(int i = 0; i < A.length(); i++) {
            sb.append(Integer.parseInt(String.valueOf(A.charAt(i))) + Integer.parseInt(String.valueOf(B.charAt(i))));
        }
        System.out.println(sb);
    }
}
