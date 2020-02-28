class ArrayTest {
    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > arr[max]) {
                max = x;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 53, 4, 6,100};
        int max = getMax(arr);
        System.out.println(max);
    }
}