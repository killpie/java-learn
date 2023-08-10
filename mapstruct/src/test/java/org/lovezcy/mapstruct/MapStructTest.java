package org.lovezcy.mapstruct;

import org.junit.Assert;
import org.junit.Test;
import org.lovezcy.entity.UserEntity;
import org.lovezcy.po.UserPo;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @Auther: killpie
 * @Date: 2023/8/9 23:20
 * @Description: MapStructTest
 */
public class



MapStructTest {

    @Test
    public void testNormal() {
        System.out.println("-----------testNormal-----start------");
        UserPo userPo = UserPo.builder()
                .id(1L)
                .gmtCreate(new Date())
                .createTime(new Date())
                .buyerId(666L)
                .userNick("测试mapstruct")
                .userVerified("ok")
                .age(18L)
                .attributes("{\"id\":\"100000\",\"name\":\"wwwww\"}")
                .build();
        System.out.println("1234 " + userPo);
        UserEntity userEntity = IPersonMapper.INSTANCE.po2entity(userPo);
        System.out.println("1234 " + userEntity);
        Assert.assertTrue(userEntity.equals(userPo));
        System.out.println("-----------testNormal-----ent------");
    }


    @Test
    public void testTime() {
        System.out.println("-----------testTime-----start------");
        int times = 50000000;
        final long springStartTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            UserPo userPo = UserPo.builder()
                    .id(1L)
                    .gmtCreate(new Date())
                    .buyerId(666L)
                    .userNick("测试123")
                    .userVerified("ok")
                    .build();
            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(userPo, userEntity);
        }
        final long springEndTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            UserPo userPo = UserPo.builder()
                    .id(1L)
                    .gmtCreate(new Date())
                    .buyerId(666L)
                    .userNick("测试123")
                    .userVerified("ok")
                    .build();
            UserEntity userEntity = IPersonMapper.INSTANCE.po2entity(userPo);
            Assert.assertNotNull(userEntity);
        }
        final long mapstructEndTime = System.currentTimeMillis();
        System.out.println("BeanUtils use time=" + (springEndTime - springStartTime) / 1000 + "秒" +
                "; Mapstruct use time=" + (mapstructEndTime - springEndTime) / 1000 + "秒");
        System.out.println("-----------testTime-----end------");
    }


    @Test
    public void testTime1() {
        System.out.println("-----------testTime-----start------");
        int times = 50000000;
        final long structStartTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            UserPo userPo = UserPo.builder()
                    .id(1L)
                    .gmtCreate(new Date())
                    .buyerId(666L)
                    .userNick("测试123")
                    .userVerified("ok")
                    .build();
            UserEntity userEntity = IPersonMapper.INSTANCE.po2entity(userPo);
            Assert.assertNotNull(userEntity);
        }
        final long mapstructEndTime = System.currentTimeMillis();


        for (int i = 0; i < times; i++) {
            UserPo userPo = UserPo.builder()
                    .id(1L)
                    .gmtCreate(new Date())
                    .buyerId(666L)
                    .userNick("测试123")
                    .userVerified("ok")
                    .build();
            UserEntity userEntity = new UserEntity();
            BeanUtils.copyProperties(userPo, userEntity);
        }
        final long springEndTime = System.currentTimeMillis();

        System.out.println("BeanUtils use time=" + (springEndTime - mapstructEndTime) / 1000 + "秒" +
                "; Mapstruct use time=" + (mapstructEndTime - structStartTime) / 1000 + "秒");
        System.out.println("-----------testTime-----end------");
    }

}
