package org.lovezcy.structure.bridge;

/**
 * @Auther: killpie
 * @Date: 2023/5/16 15:02
 * @Description: ConcreteRemoteControl1
 */
public class ConcreteRemoteControl1 extends RemoteControl{
    public ConcreteRemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("ConcreteRemoteControl1.on()");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("ConcreteRemoteControl1.off()");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("ConcreteRemoteControl1.tuneChannel()");
        tv.tuneChannel();
    }
}
