import java.io.*;
import java.util.*;
// class SequenceDemo {
//     public static void main(String[] args) throws IOException{
//         Vector<FileInputStream> v = new Vector<FileInputStream>();
//         v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\1.txt"));
//         v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\2.txt"));
//         v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\3.txt"));
//         Enumeration<FileInputStream> en = v.elements();
//         SequenceInputStream sis = new SequenceInputStream(en);
//         FileOutputStream fos = new FileOutputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\4.txt");
//         byte[] buf = new byte[1024];
//         int len = 0;
//         while ((len = sis.read(buf)) != -1){
//             fos.write(buf,0,len);
//         }
//         fos.close();
//         sis.close();
//     }
// }

class SequenceDemo {
    public static void main(String[] args) throws IOException{
        Vector<FileInputStream> v = new Vector<FileInputStream>();
    
        v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\1.txt"));
        v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\2.txt"));
        v.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\3.txt"));
        Enumeration<FileInputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\5.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = sis.read(buf)) != -1) {
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }
}