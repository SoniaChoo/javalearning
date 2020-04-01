import java.util.*;

class pat30 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long p = scan.nextLong();
        scan.nextLine();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length;i++){
            for (int j = i+1;j < arr.length;j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // for (int i = 0; i < arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // int Maxcount = 0;
        // for (int i = 0; i < arr.length;i++){
        //     long creatial = arr[i]*p;
        //     int count = 0;
        //     for (int j = i; j < arr.length;j++){
        //         if (arr[j] <= creatial){
        //             count++;
        //         }
        //     }
        //     //System.out.println(count);
        //     if (Maxcount < count){
        //         Maxcount = count;
        //     }
        // }
        int Maxcount = 0;
        for (int i =0,j =0; i<=j && j < n;){
            if (arr[j] <= arr[i]*p){
                j++;
            }else if (arr[j] > arr[i]* p){
                i++;
            }
            if (j-i > Maxcount){
                Maxcount = j-i;
            }
        }
        System.out.println(Maxcount);
    }
}