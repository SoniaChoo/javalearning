import java.io.*;
import java.util.*;

class Test16 {
    public static void main(String[] args) throws Exception {
        writeFile();
    }

    public static void writeFile() throws Exception {
        FileReader fr = new FileReader("a.txt");
        CharArrayWriter caw = new CharArrayWriter();
        int ch = 0;
        while (( ch = fr.read()) != -1) {
            if (ch == '\r'|| ch == '\n') {
                continue;
            }
            caw.write(ch);
        }

        char[] arr = caw.toCharArray();
        Arrays.sort(arr);
        FileWriter fw = new FileWriter("b.txt");
        fw.write(arr);
        fw.close();

    }
}