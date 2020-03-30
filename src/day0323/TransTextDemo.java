import java.io.*;
import java.net.*;

class TransClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.123.237", 10008);
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = null;
        while((line = bufr.readLine()) != null) {
            if("over".equals(line)) {
                break;
            }
            bufOut.write(line);
            bufOut.newLine();
            bufOut.flush();

            String str = bufIn.readLine();
            System.out.println("from sever:"+str);
        }
        bufr.close();
        s.close();
    }
}

class TransServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(10008);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip+"...connected");

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bufOut = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line = null;
        while (( line = bufIn.readLine()) != null) {
            bufOut.write(line.toUpperCase());
            bufOut.newLine();
            bufOut.flush();
        }
        s.close();
        ss.close();
    }
}

