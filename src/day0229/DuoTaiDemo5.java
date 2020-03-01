interface PCI {
    public void open();
    public void close();
}

class MainBoard{
    public void run(){
        System.out.println("mainboard run");
    }
    public void usePCI(PCI p) {
        if (p != null) {
            p.open();
            p.close();
        }
    }
}

class NetCard implements PCI {
    public void open(){
        System.out.println("netcard open");
    }
    public void close(){
        System.out.println("netcard close");
        //method();
    }
}

class SoundCard implements PCI {
    public void open() {
        System.out.println("SoundCard open");
    }
    public void close(){
        System.out.println("SoundCard close");
    }
}

class SoundCard2 implements PCI {
    public void open() {
        System.out.println("SoundCard2 open");
    }
    public void close(){
        System.out.println("SoundCard2 close");
    }
}

class DuoTaiDemo5 {
    public static void main(String[] args) {
        MainBoard mb = new MainBoard();
        mb.run();
        mb.usePCI(null);
        //PCI p = new SoundCard();
        //PCI p = new SoundCard2();
        PCI p = new NetCard();
        mb.usePCI(p);

        // mb.usePCI(new NetCard());
        // mb.usePCI(new SoundCard());
    }
}