package package1;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class Test3 {

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.test1();
        t3.test2();
        t3.test3();
    }

    @Test
    public void test1(){
        Object lock = new Object();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
            }
        }).start();

        new Thread(() -> {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
                }
            }
        }).start();



    }


    @Test
    public void test2(){
        Object lock = new Object();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
            }
        }).start();

        new Thread(() -> {
            synchronized (new Object()) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
                }
            }
        }).start();



    } @Test
    public void test3(){
        Object lock = new Object();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
            }
        }).start();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(new Date() + "\t" + Thread.currentThread().getName() + "\t" + i);
                }
            }
        }).start();



    }

}
