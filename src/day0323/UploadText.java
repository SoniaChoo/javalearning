import java.io.*;
import java.net.*;

class TextClient {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("192.168.123.237", 10007);
        BufferedReader bufr = new BufferedReader(new FileReader("IPDemo.java"));
        PrintWriter out = new PrintWriter(s.getOutputStream());
        String line = null;
        while((line = bufr.readLine()) != null) {
            out.println(line);
        }
        s.shutdownOutput();
        BufferedReader bufln = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bufln.readLine();
        System.out.println(str);
        bufr.close();
        s.close();
    }
}

class TextServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10007);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"...connected"); 
        BufferedReader bufln = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(new FileWriter("sever.txt"),true);
        String line = null;
        while((line = bufln.readLine()) != null) {
            out.println(line);
        }

        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("successful");
        out.close();
        s.close();
        ss.close();
    }
}