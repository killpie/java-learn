package org.lovezcy.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @Auther: killpie
 * @Date: 2023/6/14 23:22
 * @Description: 交替打印ABC
 */
public class AlternatePrintingABC {

    private static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static CountDownLatch countDownLatch10 = new CountDownLatch(1);

    private static volatile Integer signal = 0;

    static class PrintA implements Runnable{

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                if (signal==0){
                    System.out.print("A");
                    signal++;
                    //notify();
                }
            }
            countDownLatch.countDown();
        }
    }
    static class PrintB implements Runnable{
        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                if (signal == 1){
                    System.out.print("B");
                    signal++;
                }
            }
            countDownLatch.countDown();
        }
    }
    static class PrintC implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                if (signal == 2) {
                    System.out.print("C");
                    signal = signal - 2;
                    //  notify();
                }
            }
            countDownLatch.countDown();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Thread printAThread = new Thread(new PrintA());
        Thread printBThread = new Thread(new PrintB());
        Thread printCThread = new Thread(new PrintC());

        printAThread.start();
        printBThread.start();
        printCThread.start();
        countDownLatch10.countDown();
        countDownLatch.await();

    }

}
