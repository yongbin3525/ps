package boj.tmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoGang_A {
    /*
    ‘В’는 ‘B’처럼 보이지만 ‘v’로 읽는다.
‘Е’는 ‘E’처럼 보이지만 ‘ye’로 읽는다.
‘Н’은 ‘H’처럼 보이지만 ‘n’으로 읽는다.
‘Р’은 ‘P’처럼 보이지만 ‘r’으로 읽는다.
‘С’는 ‘C’처럼 보이지만 ‘s’로 읽는다.
‘У’는 ‘Y’처럼 보이지만 ‘u’로 읽는다.
‘Х’는 ‘X’처럼 보이지만 ‘h’로 읽는다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replace("B", "v").replace("E", "ye").replace("H", "n")
                .replace("P", "r").replace("C", "s").replace("Y", "u")
                .replace("X", "h").toLowerCase();

        System.out.println(str);
    }
}
