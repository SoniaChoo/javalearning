import java.io.*;

class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt",true);
        fw.write("nihao\nguoguo");
        fw.close();
    }
}