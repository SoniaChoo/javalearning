public class bubbledemo {
    public static void bubblesort(int[] arr) {
        for (int x=0; x < arr.length-1; x++) {
            for (int y = 0; y < arr.length-x-1; y++) {//注意y的上界
                if (arr[y] < arr[y+1]) {//也是通过改变符号来决定是升序还是降序
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }

    public static void printarray(int[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            if (i != arr.length-1) {
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.println(arr[i]+"]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4 ,44, 35, 65, 1, 56};
        printarray(arr);
        bubblesort(arr);
        printarray(arr);
    }
}