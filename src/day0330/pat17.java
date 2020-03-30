import java.math.*;
import java.io.*;

class pat17 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = bufr.readLine().split(" ");
        bufr.close();
        BigInteger a, b, c, d;
        a = new BigInteger(buf[0]);
        b = new BigInteger(buf[1]);
        c = a.divide(b);
        d = a.mod(b);
        System.out.println(c + " "+d);
    }
}