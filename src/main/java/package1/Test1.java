package package1;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import sun.awt.image.OffScreenImageSource;

import javax.sound.midi.VoiceStatus;
import java.io.*;

public class Test1 implements Serializable {
    private static final long serialVersionUID = 1L;
    String str;


    int int1 = 5;
    @Test
    public void test1(){
        System.out.println(int1);
        int1 = 6;
        System.out.println(int1);
    }

    public Test1(String str){
        this.str = str;
    }

//    public static void main(String[] args) {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream("/Users/whq/PrivateProject/TempFile/mavenJavaTest1_Test1.txt");
//            oos = new ObjectOutputStream(fos);
//
//            Test1 t1 = new Test1("567");
//            oos.writeObject(t1);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                oos.flush();
//                oos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//    }

    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("/Users/whq/PrivateProject/TempFile/mavenJavaTest1_Test1.txt");
            ois = new ObjectInputStream(fis);
            Test1 t2 = (Test1)ois.readObject();
            System.out.println(t2.str);
            System.out.println(t2.int1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
