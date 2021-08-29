package boj._3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _3052 {

    // my case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt() % 42);
        }
        HashSet<Integer> arr2 = new HashSet<>(arr);
        ArrayList<Integer> arr3 = new ArrayList<>(arr2);
        System.out.println(arr3.size());

    }

    //other case
    public void other() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.print(h.size());
    }
}
