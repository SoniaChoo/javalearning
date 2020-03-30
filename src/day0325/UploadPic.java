import java.io.*;
import java.net.*;
class PicClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.123.237", 10009);
        FileInputStream fis = new FileInputStream("1.bmp");
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf)) != -1) {
            out.write(buf,0,len);
        }
        s.shutdownOutput();
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int num = in.read(bufIn);
        System.out.println(new String(bufIn,0,num));
        fis.close();
        s.close();
    }
}

class PicSerVer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10009);
        Socket s = ss.accept();
        InputStream in = s.getInputStream();
        FileOutputStream fos = new FileOutputStream("server2.bmp");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = in.read(buf)) != -1) {
            fos.write(buf,0,len);
        }

        OutputStream out = s.getOutputStream();
        out.write("successfully".getBytes());
        fos.close();
        s.close();
        ss.close();
    }
}