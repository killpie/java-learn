package org.lovezcy.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: killpie
 * @Date: 2023/5/16 15:21
 * @Description: 叶子节点
 */
public class Leaf extends Component{

    private List<Component> child;

    public Leaf(String name) {
        super(name);
        child = new ArrayList<Component>();
    }


    void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.printf("--");
        }
        System.out.println("left:"+name);
    }

    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
