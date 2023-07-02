package org.lovezcy.structure.facade;

/**
 * @Auther: killpie
 * @Date: 2023/5/15 21:59
 * @Description: 外观
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTv();
        subSystem.setCD("英雄本色");
        subSystem.startWatching();
    }
}
