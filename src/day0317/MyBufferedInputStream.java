import java.io.*;

class MyBufferedInputStream {
    private InputStream in;
    private byte[] buf = new byte[1024];
    private int pos = 0, count = 0;
    MyBufferedInputStream(InputStream in){
        this.in = in;
    }
    public int myRead() throws IOException {
        if (count == 0) {
            count = in.read(buf);
            if (count < 0) {
                return -1;
            }
            pos = 0;
            byte b = buf[pos];
            pos++;
            count--;
            return b&255;
        }
        else if (count > 0){
            byte b = buf[pos];
            pos++;
            count--;
            return b&0xff;
        }
        return -1;
    }

    public void myClose() throws IOException {
        in.close();
    }
}