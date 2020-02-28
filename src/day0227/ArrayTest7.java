class ArrayTest7 {
    public static void trans(int num, int base, int offset) {
        char[] chs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & base;
            arr[--pos] = chs[temp];
            num = num >>> offset;
        }

        for (int x = pos; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
    }

    public static void main(String[] args) {
        trans(60, 15, 4);
        System.out.println();
        trans(6, 1, 1);
        System.out.println();
        trans(60, 7, 3);
    }
}