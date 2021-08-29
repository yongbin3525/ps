package boj._2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {

    // my case
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            for (int j = 0; j < strArr[1].length(); j++) {
                for (int x = 0; x < Integer.parseInt(strArr[0]); x++) {
                    result += strArr[1].charAt(j);
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }

    //other case
    public void other() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);

            for (byte val : str[1].getBytes()) {
                for (int j = 0; j < R; j++) {
                    sb.append((char) val);
                }
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}

