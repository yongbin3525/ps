package boj._1500;

import java.util.Scanner;

public class _1543 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ss = sc.nextLine();
        int n = s.length();
        System.out.println((n - (s.replaceAll(ss, "").length())) / ss.length());
    }

}
