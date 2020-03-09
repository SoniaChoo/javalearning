import java.util.*;

class ListDemo {
    public static void sop(Object obj) {
        System.out.println(obj);
    }
    public static void method(){
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        
        sop("before"+ al);
        al.add(1, "java09");
        al.remove(2);
        al.set(2, "java007");
        sop("get(1):"+al.get(1));
        sop(al);

        for (int x= 0; x< al.size(); x++) {
            System.out.println("al("+x+")="+al.get(x));
        }

        Iterator it = al.iterator();
        while(it.hasNext()) {
            sop("next:"+it.next());
        }

        sop("index="+al.indexOf("java02"));
        List sub = al.subList(1,3);
        sop("sub="+sub);
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        sop(al);
        
        ListIterator li = al.listIterator();
        while(li.hasNext()) {
            Object obj = li.next();
            if (obj.equals("java02")) {
                li.set("java006");
            }
        }

        while (li.hasPrevious()) {
            sop("pre:"+li.previous());
        }

        sop(al);
        Iterator it = al.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
                if (obj.equals("java02")) {
                    it.remove();
                }
            sop("obj="+obj);
        }
        sop(al);
    }
}