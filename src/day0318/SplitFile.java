import java.io.*;
import java.util.*;

class SplitFile {
    public static void main(String[] args) throws IOException{
        //merge();
        splitFile();
    }
    public static void merge() throws IOException {
        ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
        for(int x = 1; x <= 3; x++) {
            al.add(new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\"+x+".txt"));
        }
        Iterator<FileInputStream> it = al.iterator();
        Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
            public boolean hasMoreElements(){
                return it.hasNext();
            }
            public FileInputStream nextElement(){
                return it.next();
            }
        };
        SequenceInputStream sis = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\6.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = sis.read(buf)) != -1) {
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }

    public static void splitFile() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\6.txt");
        FileOutputStream fos = null;    
        byte[] buf = new byte[50];
        int len = 0;
        int count = 8;
        while((len = fis.read(buf) )!= -1) {
            fos = new FileOutputStream("C:\\Users\\Tony\\java\\javalearning\\src\\day0318\\"+count+".txt");
            count++;
            fos.write(buf,0,len);
            fos.close();
        }
        fis.close();
    }
}