package org.lovezcy.createpattern.singleton;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 21:03
 * @Description: 静态内部类实现
 * 当 Singleton 类加载时，静态内部类 SingletonHolder
 * 没有被加载进内存。只有当调用 getUniqueInstance()
 * 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例。这种方式不仅具有延迟初始化的好处，而且由虚拟机提供了对线程安全的支持。
 */
public class Singleton5 {
    private void Singleton5(){}

    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
