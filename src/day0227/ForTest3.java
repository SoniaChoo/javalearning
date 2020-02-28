class ForTest3 {
    public static void main(String[] args) {
        int count = 0;
        for (int x=0; x< 100; x++) {
            if (x%7 == 0) {
                count++;
            }
        }
        System.out.println("count="+count);
    }
}