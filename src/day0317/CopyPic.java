import java.io.*;

class CopyPic {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("2.bmp");
            fis = new FileInputStream("1.bmp");
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf,0, len);
            }
        }
        catch (IOException e) {
            System.out.println(e.toString());
            throw new RuntimeException("copy file failed");
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch (IOException e){
                throw new RuntimeException("close read failed");
            }
            try {
                if (fos != null){
                    fos.close();
                }
            }
            catch(IOException e) {
                throw new RuntimeException("close write failed");
            }
        }
    }
}