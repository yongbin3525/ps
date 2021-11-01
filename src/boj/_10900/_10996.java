package boj._10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 2*N; i++){
            // 홀수 행
            if(i % 2 == 1){
                for(int j = 1; j <= N; j++){
                    // 홀수 번째
                    if(j % 2 == 1){
                        System.out.print("*");
                    }
                    // 짝수 번째
                    else{
                        System.out.print(" ");
                    }
                }
            }
            // 짝수 행
            else{
                for(int j = 1; j <= N; j++){
                    // 홀수 번째
                    if(j % 2 == 1){
                        System.out.print(" ");
                    }
                    // 짝수 번째
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");

        }
    }
}
