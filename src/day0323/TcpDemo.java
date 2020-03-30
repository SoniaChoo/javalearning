import java.net.*;
import java.io.*;

class TcpClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.123.237",10005);
        OutputStream out = s.getOutputStream();
        out.write("tcp ge men la le".getBytes());
        s.close();
    }
}

class TcpSever {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10005);
        while(true) {
            Socket s = ss.accept();
            String ip = s.getInetAddress().getHostAddress();
            System.out.println(ip+"....connected");

            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf,0,len));
            s.close();
        }
    }
}