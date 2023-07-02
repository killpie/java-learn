package org.lovezcy.structure.facade;

/**
 * @Auther: killpie
 * @Date: 2023/5/15 22:07
 * @Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }
}
