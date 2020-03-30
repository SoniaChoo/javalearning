import java.io.*;

class CopyMP3 {
    public static void main(String[] args) throws IOException{
        long start = System.currentTimeMillis();
        copy_2();
        long end = System.currentTimeMillis();
        System.out.println((end-start) + "second");
    }    

    public static void copy_1() throws IOException{
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("0.mp3"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("1.mp3"));
        int by = 0;
        while((by = bufis.read()) != -1){
            bufos.write(by);
        }
        bufos.close();
        bufis.close();
    }

    public static void copy_2() throws IOException {
        MyBufferedInputStream bufis = new MyBufferedInputStream(new FileInputStream("9.mp3"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("3.mp3"));
        int by = 0;
        while ((by = bufis.myRead()) != -1) {
            bufos.write(by);
        }
        bufos.close();
        bufis.myClose();
    }
}