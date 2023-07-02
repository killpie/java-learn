package org.lovezcy.structure.bridge;

/**
 * @Auther: killpie
 * @Date: 2023/5/16 14:59
 * @Description: 遥控器
 */
public abstract class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv){
        this.tv = tv;
    }

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();

}
