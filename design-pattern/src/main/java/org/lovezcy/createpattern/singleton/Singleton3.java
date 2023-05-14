package org.lovezcy.createpattern.singleton;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 19:20
 * @Description: 懒汉式-线程安全
 * 通过类锁保证线程安全
 */
public class Singleton3 {

    private static Singleton3 uniqueInstance = null;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton3();
        }
        return uniqueInstance;
    }

}
