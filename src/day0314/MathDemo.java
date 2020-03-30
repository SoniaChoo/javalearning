练习。给定一个小数。
保留该小数的后两位。

选作。可以考虑，保留时进行四舍五入。

*/

import java.util.*;

class MathDemo {
    public static void main(String[] args){
        // Random r = new Random();
        // for (int x = 0; x < 10; x++) {
        //     //int d = (int)(Math.random()*10+1);
        //     int d = r.nextInt(10)+1;
        //     sop(d);
        // }
        saveTwo(12.3456,2,true);
    }

    public static void show(){
        double d = Math.ceil(16.34);
        double d1 = Math.floor(12.34);
        long l = Math.round(12.34);
        long l1 = Math.round(12.56);
        sop(d);
        sop(d1);
        sop(l);
        sop(l1);
        double d3 = Math.pow(2, 3);
        sop(d3);
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void saveTwo(double d, int scale, boolean isRound) {
        double base = Math.pow(10,scale);
        double num = isRound?Math.round(d*base)/base :((int)(d*base))/base;
        sop("num="+num);
    }
}