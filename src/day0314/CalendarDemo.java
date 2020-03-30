import java.util.*;
import java.text.*;

class CalendarDemo {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        String[] mons = {"一月","二月","三月","四月"
					,"五月","六月","七月","八月"
					,"九月","十月","十一月","十二月"};
        String[] weeks = {"", "星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
        int index1 = c.get(Calendar.MONTH);
        int index2 = c.get(Calendar.DAY_OF_WEEK);            
        //sop(c);
        sop(c.get(Calendar.YEAR));
        sop(mons[index1]);
         sop(c.get(Calendar.DAY_OF_MONTH));
        sop(weeks[index2]);
        //sop(c.get(Calendar.DAY_OF_MONTH));
    }
    public static void sop(Object obj){
        System.out.println(obj);
    }
}