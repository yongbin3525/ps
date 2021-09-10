package boj._10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    break;
                case "pop":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.removeFirst());
                    break;
                case "empty":
                    if (queue.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "front":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getFirst());
                    break;
                case "back":
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.getLast());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
            }
        }
    }
}
