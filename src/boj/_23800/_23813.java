package boj._23800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _23813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long sum = 0;
        for(int i = 0; i < str.length(); i++){
            str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);

    }

}
