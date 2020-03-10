import java.util.*;

class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new StrLenComparatpr());
        ts.add("abcd");
        ts.add("cc");
        ts.add("cba");
        ts.add("aaa");
        ts.add("z");
        ts.add("hahaha");

        Iterator it = ts.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class StrLenComparatpr implements Comparator {
    public int compare(Object o1, Object o2){
        String s1 = (String)o1;
        String s2 = (String)o2;

        int num = new Integer(s2.length()).compareTo(new Integer(s1.length()));
        if (num == 0) {
            return s2.compareTo(s1);
        }
        return num;
    }
}