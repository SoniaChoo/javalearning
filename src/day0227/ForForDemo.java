class ForForDemo {
    public static void main(String[] args) {
        for (int x = 0; x<=5;x++) {
            for (int y = x; y< 6;y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x= 1; x< 10; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "="+ x*y+"\t");
            }
            System.out.println();
        }
    }
}