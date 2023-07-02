package org.lovezcy.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @Auther: killpie
 * @Date: 2023/6/14 23:22
 * @Description: 交替打印ABC
 */
public class AlternatePrintingABC1 {

    private static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static volatile int signal = 0;
    private static volatile Object lock = new Object();
    static class PrintA implements Runnable {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (signal % 3 != 0) { // 当前不是打印A的信号，等待
                            lock.wait();
                        }
                        System.out.print("A");
                        signal++; // 切换到下一个信号
                        Thread.sleep(10);
                        lock.notify(); // 唤醒其他线程
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    static class PrintB implements Runnable {
        @Override
        public void run() {
            try {

                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (signal % 3 != 1) { // 当前不是打印B的信号，等待
                            lock.wait();
                        }
                        System.out.print("B");
                        signal++; // 切换到下一个信号
                        lock.notify(); // 唤醒其他线程
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    static class PrintC implements Runnable {
        @Override
        public void run() {
            try {

                for (int i = 0; i < 10; i++) {
                    synchronized (lock) {
                        while (signal % 3 != 2) { // 当前不是打印C的信号，等待
                            lock.wait();
                        }
                        System.out.print("C");
                        signal++; // 切换到下一个信号
                        lock.notify(); // 唤醒其他线程
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread printAThread = new Thread(new PrintA());
        Thread printBThread = new Thread(new PrintB());
        Thread printCThread = new Thread(new PrintC());

        printAThread.start();
        printBThread.start();
        printCThread.start();
        countDownLatch.await(); // 等待所有线程执行完毕

        System.out.println(); // 换行
    }

}

