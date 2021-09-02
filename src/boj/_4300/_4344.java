package boj._4300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(bf.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < C; i++){
            int sum = 0;
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                list.add(Integer.parseInt(token));
                sum += Integer.parseInt(token);
            }
            int avg = sum / N;
            int cnt = 0;
            for (Integer integer : list) {
                if (avg < integer) {
                    cnt += 1;
                }
            }
            sb.append(String.format("%.3f", (double) cnt / N * 100)).append("%");
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // ohter case
    public void other() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int testcase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0 ; i < testcase ; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            double sum = 0;
            for(int j = 0 ; j < N ; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            double mean = (sum / N) ;
            double count = 0;
            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}
