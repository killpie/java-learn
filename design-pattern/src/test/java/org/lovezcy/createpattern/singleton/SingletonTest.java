package org.lovezcy.createpattern.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class SingletonTest {

    @Test
    public void testSingleton1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);  // 输出true
    }

    @Test
    public void testSingleton2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Singleton6> constructor = Singleton6.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton6 singleton1 = constructor.newInstance();
        Singleton6 singleton2 = Singleton6.INSTANCE;
        System.out.println(singleton1 == singleton2);  // 输出true
    }


}