class ArrayTest2 {
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = x+1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int x=0; x< arr.length; x++) {
            for (int y=0; y< arr.length-x-1; y++) {
                if (arr[y] > arr[y+1]) {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 20, 6, 3, 11};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                System.out.print(arr[i]+" ");
            }else{
                System.out.println(arr[i]);
            }
        }
    }
}