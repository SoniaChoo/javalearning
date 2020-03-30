import java.io.*;

import java.util.*;

import java.text.*;

class exceptionInfo {
    public static void main(String[] args)  throws IOException{
        try {
            int[] arr = new int[2];
            System.out.println(arr[3]);
        }
        catch (Exception e){
            try {
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String s = sdf.format(d);

                PrintStream ps = new PrintStream("exception.log");
                ps.println(s);
                //ps.write(s.getBytes());
                System.setOut(ps);
            }
            catch(IOException ex){
                throw new RuntimeException("log file failed");
            }
            e.printStackTrace(System.out);
        }
    }
}