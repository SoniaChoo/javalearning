class ArrayTest6 {
    public static void toBIn(int num) {
        char[] chs = {'0', '1'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & 1;
            arr[--pos] = chs[temp];
            num = num >>> 1;
        }
        for (int x = pos;x < arr.length;x++) {
            System.out.print(arr[x]);
        }
    }

    public static void toHex(int num) {
        char[] chs2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr2 = new char[8];
        int pos2 = arr2.length;
        while (num != 0) {
            int temp = num & 15;
            arr2[--pos2] = chs2[temp];
            num = num >>> 4;
        }

        for (int x = pos2; x < arr2.length; x++) {
            System.out.print(arr2[x]);
        }
    }

    public static void main(String[] args) {
        toBIn(6);
        System.out.println();
        toHex(60);
    }
}