package org.lovezcy.createpattern.singleton;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 19:12
 * @Description: 饿汉式-线程安全
 *
 * 线程不安全问题主要是由于 uniqueInstance 被多次实例化，
 * 采取直接实例化 uniqueInstance 的方式就不会产生线程不安全问题。
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {
        return instance;
    }
}
