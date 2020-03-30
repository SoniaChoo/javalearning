import java.net.*;

class UdpSend {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(8888);
        byte[] buf = "udp ge men lai le".getBytes();
        DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.123.237"),10001);
        ds.send(dp);
        ds.close();
    }
}

class UdpRece {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(10001);
        while (true) {
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf,buf.length);
            ds.receive(dp);
            String ip = dp.getAddress().getHostAddress();
            String data = new String(dp.getData(), 0, dp.getLength());
            int port = dp.getPort();
            System.out.println(ip+"::"+data+"::"+port);
        }
        //ds.close();
    }
}