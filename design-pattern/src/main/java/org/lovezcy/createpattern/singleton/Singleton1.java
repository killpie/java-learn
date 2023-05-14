package org.lovezcy.createpattern.singleton;

/**
 * 单例模式-懒汉式-线程不安全
 * 以下实现中，私有静态变量 uniqueInstance 被延迟实例化，
 * 这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，
 * 从而节约资源。这个实现在多线程环境下是不安全的，
 * 如果多个线程能够同时进入 if (uniqueInstance == null) ，
 * 并且此时 uniqueInstance 为 null，
 * 那么会有多个线程执行 uniqueInstance = new Singleton();
 * 语句，这将导致多次实例化 uniqueInstance。
 *
 * JVM类加载机制中，确保一个类只被初始化一次的关键在于类初始化阶段的同步机制。当一个类被初始化时，JVM会获取一个锁来保证线程安全。只有一个线程能够获取这个锁，其他线程会被阻塞直到该线程释放锁。
 *
 * 在类初始化过程中，JVM会执行类的静态代码块和静态变量初始化。
 * 这些静态变量包括static final类型的常量和被声明为static的变量。这些静态变量都是在类初始化阶段进行赋值的，
 * 因此可以通过同步机制来确保只被初始化一次。
 *
 * 在JVM中，类初始化是线程安全的，因为只有一个线程能够获取类初始化阶段的锁。
 * 当多个线程同时请求初始化一个类时，只有一个线程会被允许进入类初始化阶段，其他线程会被阻塞。
 * 当第一个线程完成类的初始化后，其他线程才会被允许继续进行初始化操作，但不会再次执行静态代码块和静态变量初始化操作。
 *
 * 需要注意的是，如果一个类的静态变量是通过方法调用或者动态代码块进行初始化的，
 * 那么就不能保证这些变量只被初始化一次，因为这些代码块和方法可能会被多次调用。
 *
 * 该模式是通过方法初始化该变量的,所以无法保证,如果是放在静态代码块或者是静态变量初始化,才可以保证代码安全
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance = null;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
