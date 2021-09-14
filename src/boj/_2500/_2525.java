package boj._2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int add = Integer.parseInt(br.readLine());

        min += add;
        while (min > 59) {
            min -= 60;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
        System.out.println(hour + " " + min);
    }

    void other(){
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();

        m += t;
        h += m/60;
        m %= 60;
        h %= 24;

        System.out.println(h+" "+m);
    }
}
