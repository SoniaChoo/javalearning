class ForTest2 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        while (x<10) {
            sum += x;
            x++;
        }
        System.out.println(sum);

        int res = 0;
        for (int y = 0; y< 10; y++) {
            res += y;
        }
        System.out.println("res="+res);
    }
}