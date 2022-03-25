package boj._1300;

import java.util.Scanner;

public class _1343 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        s = s.replace("XXXX", "AAAA");
        s = s.replace("XX", "BB");

        if (s.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(s);
        }
    }

}
