import java.io.*;

class CopyText {
    public static void main(String[] args) throws IOException{
        copy_1();
    }

    public static void copy_2(){
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("FileWriterDemo3_copy.txt");
            fr = new FileReader("FileWriterDemo3.java");
            char[] buf = new char[1024];
            int num = 0;
            while ((num = fr.read(buf)) != -1) {
                fw.write(buf,0,num);
            }
        }
        catch(IOException e) {
            throw new RuntimeException("read and wirte failed");
        }

        // finally {
        //     if (fr != null) {
        //         try {
        //             fr.close();
        //         }
        //         catch (IOException e) {

        //         }
        //     }
        //     if (fw != null) {
        //         try {
        //             fw.close();
        //         }
        //         catch(IOException e){

        //         }
        //     }
        // }

        finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }
            catch(IOException e){}
            finally {
                if (fw != null) {
                    try {
                        fw.close();
                    }
                    catch(IOException e){}
                }
            }
        }
    }

    public static void copy_1() throws IOException {
        FileWriter fw = new FileWriter("FileWriterDemo3_copy.txt");
        FileReader fr = new FileReader("FileWriterDemo3.java");
        int ch = 0;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
       // fw.close();
        fr.close();
        fw.close();
    }
}