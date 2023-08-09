package org.lovezcy.createpattern.singleton;

public enum Singleton6 {
    INSTANCE;

    public void doSomething() {
        System.out.println("do something");
    }

    Singleton6() {
        System.out.println("init");
    }
}
