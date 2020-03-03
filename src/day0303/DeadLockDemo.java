class Ticket implements Runnable {
    private int tick = 100;
    Object obj = new Object();
    boolean flag = true;
    public void run() {
       if(flag)
		{
			while(true)
			{
                if (tick == 0) {
                    return;
                }
				synchronized(obj)
				{
					show();
				}
			}
		}
		else{
			while(true){
                if (tick == 0) {
                    return;
                }
				show();
            }
        }
    }

    public synchronized void show(){
        synchronized(obj) {
            if (tick>0){
            System.out.println(Thread.currentThread().getName()+"+++"+tick--);
            } 
        }
    }
}

class DeadLockDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t.flag = false;
        t2.start();
    }
}