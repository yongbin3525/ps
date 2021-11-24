package boj._2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _2139 {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if ("0 0 0".equals(str)) {
                break;
            }
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
            Date firstDate = format.parse("1 1 " + str.split(" ")[2]);
            Date secDate = format.parse(str);
            long calDate = secDate.getTime() - firstDate.getTime();
            long calDateDays = calDate / (24 * 60 * 60 * 1000);
            System.out.println(calDateDays + 1);
        }
    }
}
