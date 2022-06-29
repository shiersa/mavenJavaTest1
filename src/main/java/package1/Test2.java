package package1;

import entity.User;
import org.junit.jupiter.api.Test;

import java.io.*;

public class Test2 {
    @Test
    public void test1() {
        User u1 = new User("001", "user1", "password1");
        User u2 = u1;
        System.out.println(u2.getUserPassword());
        u1.setUserPassword("pw1");
        System.out.println(u2.getUserPassword());
    }

    @Test
    public void test2(){
        String str1 = "str1";
        String str2 = str1;
        System.out.println(str2);
        str1 = "STR1";
        System.out.println(str1);
        System.out.println(str2);
    }

    @Test
    public void test3() throws FileNotFoundException {
        File file = new File("/Users/shiersa/PrivateProject/TempFile/mavenJavaTest1_Test1.txt");
        InputStream is = new FileInputStream(file);

        System.out.println(file.length());
    }
}
