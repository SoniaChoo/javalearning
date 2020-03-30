import java.io.*;

class TransStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader bufr = new BufferedReader(isr);
        //BufferedReader bufr = new BufferedReader(new InputStream(System.in));

        // fferedWriter bufw = new BufferedWriter(osw);
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = null;
        while ((line = bufr.readLine() )!= null) {
            if ("over".equals(line)) {
                break;
            }
            bufw.write(line.toUpperCase());
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
    }
}

