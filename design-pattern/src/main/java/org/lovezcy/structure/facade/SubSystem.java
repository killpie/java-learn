package org.lovezcy.structure.facade;

/**
 * @Auther: killpie
 * @Date: 2023/5/15 21:56
 * @Description: 子系统
 */
public class SubSystem {

    public void turnOnTv(){
        System.out.println("打开TV");
    }

    public void setCD(String cd){
        System.out.println("放置CD:"+cd);
    }

    public void startWatching(){
        System.out.println("开始放映");
    }

}
