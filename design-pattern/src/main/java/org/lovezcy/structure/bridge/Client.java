package org.lovezcy.structure.bridge;

/**
 * @Auther: killpie
 * @Date: 2023/5/16 15:03
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new ConcreteRemoteControl1(new RCA());
        remoteControl.tuneChannel();
        remoteControl.on();
        remoteControl.off();

    }
}
