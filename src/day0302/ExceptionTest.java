class LanPingException extends Exception {
    LanPingException(String message) {
        super(message);
    }
}

class MaoYanException extends Exception {
    MaoYanException(String message) {
        super(message);
    }
}

class NoPlanException extends Exception {
    NoPlanException(String msg) {
        super(msg);
    }
}

class Computer {
    private int state = 3;
    public void run() throws LanPingException, MaoYanException {
        if (state == 2) {
            throw new LanPingException("lan ping");
        }
        if (state == 3) {
            throw new MaoYanException("mao yan");
        }
        System.out.println("run");
    }

    public void reset() {
        state = 1;
        System.out.println("chong qi");
    }
}

class Teacher {
    private String name;
    private Computer cmpt;

    Teacher(String name) {
        this.name = name;
        cmpt = new Computer();
    }

    public void prelect() throws NoPlanException {
        try {
            cmpt.run();
        }
        catch (LanPingException e) {
            cmpt.reset();
        }
        catch (MaoYanException e) {
            test();
            throw new NoPlanException("jiangke wufa jixu"+e.getMessage());
        }
        System.out.println("lesson");
    }

    public void test(){
        System.out.println("lianxi");
    }
}

class ExceptionTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("bi lao shi");
        try {
            t.prelect();
        }
        catch(NoPlanException e) {
            System.out.println(e.toString());
            System.out.println("fangjia");
        }
    }
}