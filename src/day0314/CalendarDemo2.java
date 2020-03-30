import java.util.*;

class CalendarDemo2 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        febDay(2020);
        //printCalendar(c);
    }

    public static void printCalendar(Calendar c){
        String[] mons = {"一月","二月","三月","四月"
					,"五月","六月","七月","八月"
					,"九月","十月","十一月","十二月"};
        String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六",};
        int index = c.get(Calendar.MONTH);
        int index1 = c.get(Calendar.DAY_OF_WEEK);
        sop(c.get(Calendar.YEAR));
        sop(mons[index]);
        sop(c.get(Calendar.DAY_OF_MONTH));
        sop(weeks[index1]);            
    }

    public static void febDay(int year){
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        sop(c.get(Calendar.DAY_OF_MONTH));
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }
}