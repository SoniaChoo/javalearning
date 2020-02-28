class OtherDemo {
    public static void main(String[] args) {
      w:  for (int x =0; x<3; x++) {
            for (int y = 0; y< 4;y++) {
                System.out.println("x="+x);
                break w;
            }
        }

        w : for (int x = 0; x <= 10; x++) {
            for (int y=0; y<4;y++) {
            if (x%2 == 1) {
                System.out.println("x="+x);
                continue w;
            }
            }
        }
    }
}