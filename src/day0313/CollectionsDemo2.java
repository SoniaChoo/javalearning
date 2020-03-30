import java.util.*;
class CollectionsDemo2 {
    public static void main(String[] args) {
        //shuffleDemo();
        //orderDemo();
        //replaceAllDemo();
        fillDemo();
    }
    public static void shuffleDemo(){
        List<String> list = new ArrayList<String>();
        list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		list.add("qq");
		list.add("z");
        sop(list);
        Collections.shuffle(list);
        sop(list);
    }

    public static void orderDemo(){
        TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenComp()));
        ts.add("abcde");
        ts.add("aaa");
        ts.add("k");
        ts.add("cc");
        for (String s:ts){
            sop(s);
        }
    }

    public static void sop(Object obj){
        System.out.println(obj);
    }

    public static void replaceAllDemo(){
        List<String> list = new ArrayList<String>();

        list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");

		sop(list);
        Collections.replaceAll(list,"aaa","pp");
        sop(list);
        Collections.reverse(list);
        sop(list);
    }

    public static void fillDemo(){
        //List<String> list = new ArrayList<String>();
        List<String> list = new ArrayList<String>();
        list.add("abcd");
		list.add("aaa");
		list.add("zz");
		list.add("kkkkk");
		
		sop(list);
        fill(list,"pp",1,3);
        sop(list);
    }

    public static void fill(List<String> list, String str, int start, int end) {
        List<String> ls = list.subList(start,end);
        Collections.fill(ls,str);
    }
}

class StrComp implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}

class StrLenComp implements Comparator<String> {
    public int compare(String s1, String s2){
        int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
        if (num == 0){
            return s1.compareTo(s2);
        }
        return num;
    }
}