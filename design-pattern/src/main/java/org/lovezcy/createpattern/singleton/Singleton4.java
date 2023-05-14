package org.lovezcy.createpattern.singleton;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 19:23
 * @Description: 双重校验锁-线程安全
 */
public class Singleton4 {
    private static volatile Singleton4 uniqueInstance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (uniqueInstance != null) {
            return uniqueInstance;
        }
        /**
         在初始化时,当时实例未初始化时,还是有大量的线程到达该类,并尝试竞争锁,
         当竞争到锁后会在同步代码块中再次检查实例是否初始化完成,如果完成则返回对象,
         减少资源消耗
         *
         */

        synchronized (Singleton4.class){
            if (uniqueInstance != null){
                return uniqueInstance;
            }
            uniqueInstance = new Singleton4();
        }
        return uniqueInstance;
    }
}
