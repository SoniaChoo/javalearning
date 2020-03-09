import java.util.*;
class CollectionDemo {
    public static void main(String[] args) {
        //method_get();
        //method_2();
        base_method();
    }
    public static void method_get() {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");

        // Iterator it = al.iterator();
        // while(it.hasNext()) {
        //     sop(it.next());
        // }

        for(Iterator it = al.iterator();it.hasNext();) {
            sop(it.next());
        }
    }

    public static void method_2(){
        ArrayList al1 = new ArrayList();
        al1.add("java01");
        al1.add("java02");
        al1.add("java03");
        al1.add("java04");

        ArrayList al2 = new ArrayList();
        al2.add("java03");
        al2.add("java04");
        al2.add("java05");
        al2.add("java06");
        al1.retainAll(al2);
        //al1.removeAll(al2);
        sop("al1:"+al1);
        sop("al2:"+al2);
    }

    public static void base_method() {
        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java04");
        sop("before:"+al);

        al.remove("java02");
       // al.clear();
       sop("java03 is existed:"+al.contains("java03"));
       sop("collection is empty:"+al.isEmpty());

       sop("size:"+al.size());
       sop("after"+al);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}