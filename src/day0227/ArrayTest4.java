class ArrayTest4 {
    public static int getIndex(int[] arr, int key) {
        int max = arr.length-1;
        int min = 0;
        int mid = (max+min)/2;
        while (arr[mid] != key) {
            if (key > arr[mid]) {
                min = mid+1;
            }
            else {
                max = mid-1;
            }
            mid = (max+min)/2;
            if (max < min) {
                return -1;
            }
        }
        return mid;
    }

    public static int getIndex_2(int[] arr, int key) {
        int max = arr.length-1;
        int min = 0;
        int mid;
        while (max >= min) {
            mid = (max+min)/2;
            if (arr[mid] > key) {
                max = mid-1;
            }
            else if (arr[mid] < key) {
                min = mid+1;
            }
            else {
                return mid;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 18, 20, 34};
        int key = 8;
        int res = getIndex_2(arr,key);
        System.out.println(res);
    }
}