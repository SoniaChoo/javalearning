import java.io.*;
import java.net.*;

class TcpClient2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.123.237",10006);
        OutputStream out = s.getOutputStream();
        out.write("hello,server".getBytes());

        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));
        s.close();
    }
}

class TcpServer2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10006);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"....connectd");
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf,0,len));

        OutputStream out = s.getOutputStream();
        Thread.sleep(10000);
        out.write("receiving,xixi".getBytes());
        s.close();
        ss.close();
    }
}