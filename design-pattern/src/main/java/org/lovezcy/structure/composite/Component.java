package org.lovezcy.structure.composite;

/**
 * @Auther: killpie
 * @Date: 2023/5/16 15:18
 * @Description: 组件类, 顶层类
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public void print(){
        print(0);
    }

    abstract void print(int level);
    abstract public void add(Component component);
    abstract public void remove(Component component);

}
