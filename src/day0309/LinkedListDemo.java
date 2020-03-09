import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add("java01");
        link.add("java02");
        link.add("java03");
        link.add("java04");

        sop(link.getFirst());
        while(!link.isEmpty()) {
            sop(link.remove());
        } 
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}