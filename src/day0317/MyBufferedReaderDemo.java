import java.io.*;

class MyBufferedReader extends Reader {
    private Reader r;
    MyBufferedReader(Reader r) {
        this.r = r;
    }
    public String myReadLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while ((ch = r.read()) != -1) {
            if (ch == '\r') {
                continue;
            }
            else if (ch == '\n') {
                return sb.toString();
            }
            else {
                sb.append((char)ch);
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }

    public int read(char[] cbuf, int off, int len) throws IOException {
        return r.read(cbuf,off,len);
    }
    public void close() throws IOException {
        r.close();
    }
    public void myClose() throws IOException {
        r.close();
    }
}

class MyBufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("demo.txt");
        MyBufferedReader myBuf = new MyBufferedReader(fr);
        String line = null;
        while ((line = myBuf.myReadLine()) != null) {
            System.out.println(line);
        }
        myBuf.myClose();
    }
}
