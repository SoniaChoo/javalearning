import java.util.*;
import java.text.*;

class DataDemo {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日E hh:mm:ss");
        String time = sdf.format(d);
        System.out.println(time);
        long l = System.currentTimeMillis();
        Date d1 = new Date(l);
        System.out.println("d1:"+d1);

    }
}