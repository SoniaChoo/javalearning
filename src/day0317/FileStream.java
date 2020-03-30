import java.io.*;

class FileStream {
    public static void main(String[] args) throws IOException {
        readFile_3();
    }
    public static void readFile_3() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        int num = fis.available();
        byte[] buf = new byte[num];//有一个缺点,可能文件的太大超过了内存,就会导致无法运行了,所以这个方法谨慎使用,还是使用方法2比较多.
        fis.read(buf);
        System.out.println(new String(buf));
        fis.close();
    }
    public static void readFile_2() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf)) != -1) {
            System.out.println(new String(buf,0,len));
        }
    }
    public static void readFile_1() throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            System.out.println((char)ch);
        }
        fis.close();
    }
    public static void writeFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write("abcde".getBytes());
        fos.close();
    }
}