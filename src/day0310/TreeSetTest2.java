import java.util.*;

class TreeSetTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        String str = "90 -7 0 18 2 45 4";
        String[] arr = str.split(" ");
        TreeSet ts = new TreeSet();
        for (int x = 0; x < arr.length;x++) {
            ts.add(Integer.parseInt(arr[x]));
        }
        System.out.println(ts);
    }
}