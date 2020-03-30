import java.io.*;

class FileDemo2 {
    public static void main(String[] args){
        File dir = new File("C:\\Users\\Tony\\java\\javalearning\\src");
        File[] files = dir.listFiles();
        for (File f: files) {
            System.out.println(f.getName()+":::"+f.length());
        }
    }

    public static void listDemo_2(){
        File dir = new File("C:\\Users\\Tony\\java\\javalearning\\src\\day0317");
        String[] arr = dir.list(new FilenameFilter(){
            public boolean accept(File dir, String name){
                //System.out.println("dir:"+dir+"...name:"+name);
                return name.endsWith(".bmp");
            }
        });
        System.out.println("len:"+arr.length);
        for (String s:arr){
            System.out.println(s);
        }
    }

    public static void listDemo(){
        File f = new File("C:\\Users\\Tony\\java\\javalearning\\src\\day0317");
        String[] names = f.list();//调用list方法的file对象必须是封装了一个目录。该目录还必须存在。
        for(String name:names){
            System.out.println(name);
        }
    }

    public static void listRootsDemo() {
        File[] files = File.listRoots();
        for(File f:files) {
            System.out.println(f);
        }
    }
}