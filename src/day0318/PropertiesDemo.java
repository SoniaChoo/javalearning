import java.io.*;
import java.util.*;

class PropertiesDemo {

    public static void main(String[] args)throws IOException {
        //method_1();
        method_2();
    }


    public static void loadDemo() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("info.txt");
        prop.load(fis);
        prop.setProperty("wangwu",39+"");
        FileOutputStream fos = new FileOutputStream("info.txt");
        prop.store(fos,"haha2");
        System.out.println(prop);
        prop.list(System.out);
        fos.close();
        fis.close();
    }

    public static void method_1() throws IOException {
        BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
        String line = null;
        Properties prop = new Properties();
        while((line = bufr.readLine()) != null) {
            String[] arr = line.split("=");
            prop.setProperty(arr[0],arr[1]);
        }
        bufr.close();
        System.out.println(prop);
    }
    public static void method_2() throws IOException{
        BufferedReader bufr = new BufferedReader(new FileReader("info.txt"));
        Properties prop = new Properties();
        String line = null;
        while((line = bufr.readLine()) != null) {
            String[] arr = line.split("=");
            prop.setProperty(arr[0],arr[1]);
        }
        bufr.close();
        System.out.println(prop);
    }

    public static void setAndGet(){
        Properties prop = new Properties();
        prop.setProperty("zhangsan","30");
        prop.setProperty("lisi","39");
        System.out.println(prop);
        String value = prop.getProperty("lisi");
        System.out.println(value);
        prop.setProperty("lisi",89+"");
        Set<String> names = prop.stringPropertyNames();
        for (String s:names){
            System.out.println(s+":"+prop.getProperty(s));
        }
    }

}