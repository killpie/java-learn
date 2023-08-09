package org.lovezcy.mapstruct;

import org.junit.Assert;
import org.junit.Test;
import org.lovezcy.entity.UserEntity;
import org.lovezcy.po.UserPo;

import java.util.Date;

/**
 * @Auther: killpie
 * @Date: 2023/8/9 23:20
 * @Description: MapStructTest
 */
public class MapStructTest {

    @Test
    public void testNormal() {
        System.out.println("-----------testNormal-----start------");
        UserPo userPo = UserPo.builder()
                .id(1L)
                .gmtCreate(new Date())
                .buyerId(666L)
                .userNick("测试mapstruct")
                .userVerified("ok")
                .age(18L)
                .build();
        System.out.println("1234" + userPo);
        UserEntity userEntity = IPersonMapper.INSTANCE.po2entity(userPo);
        Assert.assertTrue(userEntity.equals(userPo));
        System.out.println("-----------testNormal-----ent------");
    }


}
