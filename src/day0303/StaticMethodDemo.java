class Ticket implements Runnable {
    private static int tick = 100;
    boolean flag = true;
    public void run() {
        if (flag) {
            while (true) {
                synchronized(Ticket.class) {
                    if (tick>0) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }
        }
        else {
            while (true) {
                show();
            }
        }
    }
    public static synchronized void show() {
        if (tick > 0) {
            System.out.println(Thread.currentThread().getName()+"...show..."+tick--);
        }
    }
}

class StaticMethodDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t.flag = false;
        t2.start();
    }
}