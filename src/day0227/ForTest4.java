class ForTest4 {
    public static void main(String[] args) {
        int count = 0;
        int length = 3000;
        while (length >= 5) {
            length = length /2;
            count++;
        }
        System.out.println(count);
    }
}