package boj._10700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            int K = Integer.parseInt(br.readLine());
            if(K == 0){
                stack.pop();
            }else{
                stack.push(K);
            }
        }
        int sum = 0;
        while(stack.size() > 0){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
