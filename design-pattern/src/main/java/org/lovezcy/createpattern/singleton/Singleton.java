package org.lovezcy.createpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 21:13
 * @Description:
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        // 私有构造方法
    }

    public static Singleton getInstance() {
        return instance;
    }
}


