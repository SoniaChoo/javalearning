import java.util.concurrent.lock.*;
class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();

    private Condition condition_pro = lock.newCondition();
    private Condition condition_con = lock.newCondition();

    public void set(String name) throws InterruptedException {
        lock.lock();
        try {
            while (flag) {
                condition_pro.await();
            }
            this.name = name+"..."+count++;
            System.out.pritnln(Thread.currentThread().getName()+"...producer"+this.name);
            flag = true;
            condition_con.signal();
        }
        finally {
            lock.unlock();
        }
    }

    public void out() throws InterruptedException {
        lock.lock();
        try {
            while(!flag) {
                condition_pro.await();
            }
            System.out.println(Thread.currentThread().getName()+"consumer..........."+this.name);
             flag = false;   
            condition_pro.signal();
        }
        finally {
            lock.unlock();
        }
    }
}

class Producer implements Runnable {
    private Resource res;
    Producer(Resource res) {
        this.res = res;
    }
    public void run(){
        while(true) {
            try {
                res.set("+apple+");
            }
            catch (InterruptedException e){

            }
        }
    }
}

class Consumer implements Runnable {
    private Resource res;
    Consumer(Resource res) {
        this.res = res;
    }
    public void run(){
        while (true) {
            try {
                res.out();
            }
            catch(InterruptedException e){}
        }
    }
} 

class ProducerConsumerDemo2 {
    public static void main(String[] args) {
        Resource r = new Resource();
        Consumer con = new Consumer(r);
        Producer pro = new Producer(r);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(pro);
        Thread t3 = new Thread(con);
        Thread t4 = new Thread(con);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
