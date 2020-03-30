import java.io.*;

class CopyTextByBuf {
    public static void main(String[] args) {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;
        try {
            bufr = new BufferedReader(new FileReader("BufferedWriterDemo.java"));
            bufw = new BufferedWriter(new FileWriter("bufWriter_Copy.txt"));
            String line = null;
            while((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        }
        catch(IOException e) {
            throw new RuntimeException("read and write failed");
        }
        finally {
            try {
                if (bufr != null) {
                    bufr.close();
                }
            }
            catch(IOException e){
                throw new RuntimeException("close read failed");
            }
            try {
                if(bufw != null) {
                    bufw.close();
                }
            }
            catch(IOException e){
                throw new RuntimeException("close write failed");
            }
        }
    }
}