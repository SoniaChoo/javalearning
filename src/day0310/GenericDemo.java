import java.util.*;

class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("abc01");
        al.add("abc0991");
        al.add("abc014");

        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s+"...."+s.length());
        }
    }
}