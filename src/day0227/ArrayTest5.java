class ArrayTest5 {
    public static void toHex(int num) {
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < 8;x++) {
            int temp = num & 15;
            if (temp > 9) {
                sb.append((char)(temp-10+'A'));
            }
            else{
                sb.append(temp);
            }
           num =  num >>> 4;
        }
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        int num = 60;
        toHex(num);
    }
}