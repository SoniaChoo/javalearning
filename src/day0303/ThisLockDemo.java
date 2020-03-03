class Ticket implements Runnable {
    private int tick = 100;
    //Object obj = new Object();
    boolean flag = true;
    public void run() {
        if (flag) {
            while(true) {
                synchronized(this) {
                    if (tick>0) {
                        System.out.println(Thread.currentThread().getName()+"...code:"+tick--);
                    }
                }
            }
        }
        else {
            while(true) {
                show();
            }
        }
    }

    public synchronized void show(){
        if (tick >0) {
            System.out.println(Thread.currentThread().getName() + "...show...:"+tick--);
        }
    }
}

class ThisLockDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t.flag = false;
        t2.start();
    }
}