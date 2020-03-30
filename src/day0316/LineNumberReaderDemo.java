import java.io.*;

class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("PersonDemo.java");
        LineNumberReader Inr = new LineNumberReader(fr);
        String line = null;
        Inr.setLineNumber(100);
        while ((line = Inr.readLine())!= null) {
            System.out.println(Inr.getLineNumber()+":"+line);
        }
        Inr.close();
    }
}