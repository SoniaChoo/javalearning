import java.util.*;

class Test{
    public static void main(String[] args){
        String str = "zxcvbasdfg";
        str = sortString(str);
        System.out.println(str);
    }

    public static String sortString(String str){
        char[] arr = stringToArray(str);
        sort(arr);
        return arrayToString(arr);
    }

    public static char[] stringToArray(String str){
        return str.toCharArray();
    }

    public static void sort(char[] arr){
        for(int x = 0; x < arr.length-1; x++){
            for(int y = x+1; y < arr.length;y++){
                if (arr[x]>arr[y]){
                    swap(arr,x,y);
                }
            }
        }
    }

    private static void swap(char[] arr, int x, int y){
        char temp = arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }

    private static String arrayToString(char[] arr){
        return new String(arr);
    }
}