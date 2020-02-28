class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr = {3, 1, 5, 6, 4;}
        int[] arr = new int[5]
        arr[0] = 90
        arr[1] = 80
        int[][] arr = new int[3][4];
        int[][] arr = new int[3][];
        int[][] arr = {{3, 5, 1,7},{2, 3, 5, 8}, {6, 1, 8, 2}};
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                sum += arr[x][y];
            }
        }
        System.out.println("sum="+sum);
    }
}