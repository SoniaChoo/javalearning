class ArrayTest3 {
    public static void reverse(int[] arr) {
        for (int x = 0, y = arr.length-1; x < y; x++,y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6};
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int x=0; x< arr.length; x++){
            if (x != arr.length-1) {
                System.out.print(arr[x]+" ");
            }
            else{
                System.out.println(arr[x]);
            }
        }
    }
}