import java.io.*;

class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.println("ch="+(char)ch);
        }
        fr.close();
    }
}