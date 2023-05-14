package org.lovezcy.createpattern.simplefactory;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 23:33
 * @Description: Client
 */
public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct("1");
        System.out.printf("product is %s\n",product.getClass().getName());
    }
}
