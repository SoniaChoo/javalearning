public class changejinzhi {
    public static void change(int n, int base, int move) {
        //定义一个表map, 定义一个容器装结果,定义一个pos记录放的位置,避免打印多余的0
        char[] maparray = {'0', '1', '2', '3', '4', '5', '6','7', '8', '9', 'A', 'B', 'C','D', 'E', 'F'};
        char[] arr = new char[32];

        int pos = arr.length-1;                 
       
        while (n != 0){
           int temp = n&base;
            arr[pos--] = maparray[temp];
            n = n>>>move;
        }
        for (int x = pos+1; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
    }

    public static void main(String[] args) {
        change(60, 7, 3
        );
    }
}