package boj._13600;

import java.util.Scanner;

public class _13610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int answer = 1;
        for(; (Y - X) * answer < Y; answer++);
        System.out.println(answer);
    }
}
