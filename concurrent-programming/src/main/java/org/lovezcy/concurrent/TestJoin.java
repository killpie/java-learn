package org.lovezcy.concurrent;

/**
 * @Auther: killpie
 * @Date: 2023/7/2 15:10
 * @Description:
 */
public class TestJoin {
    static int count=0;

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(()->{
            System.out.println("Thread t1 run");
            try {
                //打印时间差
                long endTime = System.currentTimeMillis();
                System.out.println("time="+(endTime-startTime));
                Thread.sleep(100000);
                long endTime1 = System.currentTimeMillis();
                System.out.println("time1="+(endTime1-startTime));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count=10;
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread t2 start");

                    t1.join();
                    System.out.println("Thread t2 end");

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();
     //   t1.join();//若把这一行注释掉，则打印的count为0

        System.out.println("count="+count);
        //感知jvm退出
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("jvm 退出");
        }));
    }
}
