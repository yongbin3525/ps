package boj._1500;

import java.util.Scanner;

public class _1543 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.nextLine();
        int count = 0;
        int index = 0;

        for (int i = index; i <= str.length() - word.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {

                if (str.charAt(i + j) != word.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
                index += word.length();
                i = index - 1;
            } else {
                index++;
            }
        }
        System.out.println(count);
        scan.close();
    }

}
