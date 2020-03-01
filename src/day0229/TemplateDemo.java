abstract class GetTime {
    public final void getTime() {
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
        System.out.println("haomao:" + (end-start));
    }
    public abstract void runcode();
}

class SubTime extends GetTime {
    public void runcode() {
        for (int x = 0; x < 4000; x++) {
            System.out.println(x);
        }
    }
}

class TemplateDemo {
    public static void main(String[] args) {
        SubTime gt = new SubTime();
        gt.getTime();
    }
}