import java.io.*;

class FileWriterDemo2 {
    public static void main(String[] args){
       FileWriter fw = null;//注意点1
        try {
           fw = new FileWriter("demo.txt");
           fw.write("abcdefgh");
       }
       catch(IOException e){
           System.out.println("catch:"+e.toString());
       }
       finally {
           try {
               if(fw != null) {//注意点2
                   fw.close();
               }
           }
           catch(IOException e){
               System.out.println(e.toString());
           }
       }
    }
}