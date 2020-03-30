import java.util.*;

class pat19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        while (true) {
            while (s.length() < 4){
                s ="0"+s;
            }
            byte[] buf = s.getBytes();
            increaseSort(buf);
            String s1 = new String(buf);
            decreaseSort(buf);
            String s2 = new String(buf);
            int temp = Integer.parseInt(s2)-Integer.parseInt(s1);
            //System.out.println(s2+" "+"-"+" "+s1+" "+"="+" "+temp);
           if (temp == 0 || temp == 6174){
               System.out.printf("%04d - %04d = %04d", Integer.parseInt(s2),Integer.parseInt(s1),temp);
               return;
           }
           System.out.printf("%04d - %04d = %04d\n",Integer.parseInt(s2),Integer.parseInt(s1),temp);
            s = String.valueOf(temp);
        }
    }

    public static void increaseSort(byte[] buf){
        for (int i = 0; i < buf.length; i++){
            for (int j = i+1; j < buf.length; j++){
                if (buf[i] > buf[j]) {
                    byte temp = buf[i];
                    buf[i] = buf[j];
                    buf[j] = temp;
                }
            }
        }
    }

    public static void decreaseSort(byte[] buf){
        for (int i = 0; i < buf.length; i++){
            for (int j = i+1; j < buf.length; j++) {
                if (buf[i] < buf[j]){
                    byte temp = buf[i];
                    buf[i] = buf[j];
                    buf[j] = temp;
                }
            }
        }
    }
}