class Demo extends Thread {
    public void run() {
        for(int x = 0; x < 60; x++) {
            System.out.println("demo run---"+x);
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        // for (int x = 0; x < 60; x++) {
        //     System.out.println("Hello World~~~~~~~~"+x);
        // }
        Demo d = new Demo();
        d.run();

        for (int x = 0; x < 60; x++) {
            System.out.println("Hello World~~~~~~~~"+x);
        }
    }
}