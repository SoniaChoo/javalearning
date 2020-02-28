public class search {
    public static int binarySearch(int[] arr, int n) {
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;
        while (arr[mid] != n) {
            if (arr[mid] > n) {
                max = mid-1;
            }
            else {
                min = mid+1;
            }
            if (max < min) {
                return min;
            }
            mid = (min+max)/2;
        }
        return mid;
    }

    public static int binarySearch2(int[] arr, int n) {
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        mid = (min+max)/2;
        while (min <= max) {
            if (arr[mid] > n) {
                max = mid-1;
            }
            else if(arr[mid] < n) {
                min = mid+1;
            }
            else {
                return mid;
            }
            mid = (max+min)/2;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 13, 30};
        int pos =  binarySearch(arr, 6);
        System.out.println(pos);
    }
}