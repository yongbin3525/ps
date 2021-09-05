package boj._1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1271 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}

// short coding
/*
    import java.math.*;import java.util.*;class Main{public static void main(String[] args){Scanner s = new Scanner(System.in);BigInteger n=new BigInteger(s.next()), m=new BigInteger(s.next());System.out.print(n.divide(m)+"\n"+n.remainder(m));}}
 */
