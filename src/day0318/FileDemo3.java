import java.io.*;
import java.util.*;

class FileDemo3 {
    public static void main(String[] args){
        File dir = new File("C:\\Users\\Tony\\java\\javalearning\\src");
        //showDir(dir,0);
        // int n = getSum(8000);
        // System.out.println(n);
        toBin(6);
    }

    public static String getLevel(int level){
        StringBuilder sb = new StringBuilder();
        sb.append("|--");
        for (int x = 0; x < level; x++) {
            sb.insert(0,"|  ");
        }
        return sb.toString();
    }

    public static void showDir(File dir, int level) {
        System.out.println(getLevel(level)+ dir.getName());
        level++;
        File[] files = dir.listFiles();
        for (int x = 0; x < files.length;x++) {
            if (files[x].isDirectory()) {
                showDir(files[x],level);
            }
            else {
                System.out.println(getLevel(level)+files[x]);
            }
        }
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);
    }

    public static void toBin(int num) {
        if (num > 0) {
            toBin(num/2);
            System.out.println(num%2);
        }
    }
}

// class FileDemo3 {
//     public static void main(String[] args) {
//         File f = new File("C:\\Users\\Tony\\java\\javalearning\\src");
//         List l = new ArrayList();
//         getFiles(f,l,0);
//     }

//     public static String getLevel(int level){
//         StringBuilder sb = new StringBuilder();
//         sb.append("|--");
//         for (int x = 0; x < level; x++) {
//             //sb.append("|--");
//             sb.insert(0, "|  ");
//            // System.out.println()
//         }
//         return sb.toString();
//     }
//     public static void getFiles(File f, List l, int level) {
//         System.out.println(getLevel(level) + f.getName());
//         level++;
//         File[] files = f.listFiles();
//         for (File f1:files) {
//             if (f1.isDirectory()){
//                 getFiles(f1,l,level);
//             }
//             else {
//                 System.out.println(getLevel(level) + "name:"+ f1.getName());
//             }
//         }
//     }
// }