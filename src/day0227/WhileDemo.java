class WhileDemo {
    public static void main(String[] args) {
        int x = 1;
        while (x<0) {
            System.out.println("x="+x);
            x++;
        }

        int z = 1;
        do {
            System.out.println("do:x="+z);
            z++;
        }
        while (z<0);
    }
}