class MyTHread extends Thread {
    public void run(){
        try {
            Thread.currentThread().sleep(3000);
        }
        catch(Exception e) {}
        System.out.println("MyThread running");
    }
}
public class Test {
    public static void main(String[] args) {
        MyTHread t = new MyTHread();
        t.run();
        t.start();
        System.out.println("Thread Test");
    }
}