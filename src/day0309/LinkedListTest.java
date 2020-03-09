import java.util.*;

class DuiLie {
    private LinkedList link;

    DuiLie() {
        this.link = new LinkedList();
    }

    public void myAdd(Object obj) {
        link.addFirst(obj);
    }
    public Object myGet() {
        return link.removeLast();
    }
    public boolean isNull(){
        return link.isEmpty();
    }
}

class Zhan {
    private LinkedList link;
    Zhan(){
        this.link = new LinkedList();
    }
    public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        return link.removeFirst();
    }
    public boolean isNull(){
        return link.isEmpty();
    }
}

class LinkedListTest {
    public static void main(String[] args) {
        Zhan dl = new Zhan();
        dl.myAdd("java01");
        dl.myAdd("java02");
		dl.myAdd("java03");
		dl.myAdd("java04");

		while(!dl.isNull())
		{
			System.out.println(dl.myGet());
		}
    }
}