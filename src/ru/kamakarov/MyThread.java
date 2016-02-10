package ru.kamakarov;

public class MyThread extends Thread {

    static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j<5; j++) {
           if (i==4) System.out.println(i);
        }

    }


    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2222);
        for (int j = 0; j < 500000; j++) {
            (new MyThread()).start();

            i++;
        }
    }
}
