package org.lovezcy.createpattern.simplefactory;

/**
 * @Auther: killpie
 * @Date: 2023/5/14 23:33
 * @Description: SimpleFactory 是简单工厂实现，它被所有需要进行实例化的客户类调用
 */
public class SimpleFactory {

    public static Product createProduct(String type){
        if (type.equals("1")){
            return new ConcreteProduct1();
        }else if (type.equals("2")){
            return new ConcreteProduct2();
        }else {
            return new ConcreteProduct();
        }
    }
}
