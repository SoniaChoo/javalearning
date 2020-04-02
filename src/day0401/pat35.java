
import java.util.*;

class pat35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= scan.nextInt();
            arr2[i] = arr[i];
        }

        scan.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] str = scan.nextLine().split(" ");
        for (int i= 0; i < str.length; i++){
            sb.append(str[i]);
        }
        String inputStr = sb.toString();
        //System.out.println(inputStr+"~~~~~~~~~~~");
        String[] ires = insertSort(arr,inputStr);
        String[] mres = mergeSort(arr2,inputStr);
        //System.out.println(ires);
        if (ires[0] == ""){
            System.out.println(ires[0]);
            System.out.println(ires[1]);
        }else{
             System.out.println(mres[0]);
            System.out.println(mres[1]);
        }
        //printArr(arr);
    }

    public static String[] insertSort(int[] arr,String inputStr){
        for (int i=1;i<arr.length;i++){
            for (int j = i; j > 0; j--){
                if (arr[j] > arr[j-1]) {
                    break;
                }else{
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return res;
    }

    public static String[] mergeSort(int[] arr,String inputStr) {
        int[] temp = new int[arr.length];
        int l = 1;
        while(l<arr.length){
           String str =  sort(arr,l,temp);   
            l = l*2;
            if(l>=arr.length){
			for(int i =0;i<arr.length;i++)
				arr[i] = temp[i];
				//printArr(temp);
			}
		else{
			sort(temp,l,arr);
			l = l*2;
		}
        }
        // for (int i = 0;i<arr.length;i++){
        //     arr[i] = temp[i];
        // }
        //printArr(temp)
        return res;
    }

    public static String sort(int[] arr, int l, int[] temp) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (i = 0; i+2*l<=arr.length;i = i+2*l){
            merge(arr,i,i+l-1,i+2*l-1,temp);
        }
        if (i+l <= arr.length){
            merge(arr,i,i+l-1,arr.length-1,temp);
        }
        // else{
        //     for(int j =i;j<arr.length;j++){
		// 	temp[j] = arr[j];
		//     }
        // }
        for (int j = 0; j< arr.length;j++){
            sb.append(temp[j]);
        }
        return sb.toString();
    }

    public static void merge(int[] arr,int i,int mid, int n,int[] temp){
        //int mid = low + (high-low)/2;
        int j = mid+1;
        int t = i;
        for (; i <= mid && j<= n;t++){
            if (arr[i] >= arr[j]){
               temp[t] = arr[j++];
            }else {
                temp[t] = arr[i++];
            }
        }
        while (i <= mid){
            temp[t++] = arr[i++];
        }

        while(j<= n){
            temp[t++] =arr[j++];
        }
    }

    public static void printArr(String[] arr){
        for (int i = 0; i < arr.length;i++){
            if (i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(" "+arr[i]);
            }
        }
    }
}