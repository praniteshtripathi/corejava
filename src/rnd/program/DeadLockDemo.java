package rnd.program;

import static java.lang.Thread.sleep;

public class DeadLockDemo {
    public static void main(String args[]) {
        String str1 = "str1";
        String str2 = "str2";
        Thread t1 = new Thread(() -> {

                synchronized (str1) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str2) {
                        System.out.println("str1+str2");
                    }
                }

        });

        Thread t2 = new Thread(() -> {

                synchronized (str2) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str1) {
                        System.out.println("str1+str2");
                    }
                }

        });
        t1.start();
        t2.start();
    }
}
