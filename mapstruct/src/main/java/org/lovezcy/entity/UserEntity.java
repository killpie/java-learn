package org.lovezcy.entity;

import lombok.Data;
import org.lovezcy.po.Attributes;
import org.lovezcy.po.UserPo;

import java.util.Date;
import java.util.Objects;

/**
 * @Auther: killpie
 * @Date: 2023/8/8 23:32
 * @Description: UserEntity
 */
@Data
public class UserEntity {
    private Long id;
    private Date gmtCreate;
    private Date createTime;
    private Long buyerId;
    private Long age;
    private String userNick1;
    private String userVerified;
    private Attributes attributes;

    /**
     * 判断UserPo对象是否相等
     */
    public boolean equals(UserPo userPo) {

        if (userPo == null) return false;
        if (!Objects.equals(id, userPo.getId())) return false;
        if (gmtCreate != userPo.getGmtCreate()) return false;
        if (createTime != userPo.getCreateTime()) return false;
        if (!Objects.equals(buyerId, userPo.getBuyerId())) return false;
        if (!Objects.equals(age, userPo.getAge())) return false;
        if (!Objects.equals(userNick1, userPo.getUserNick())) return false;
        if (!Objects.equals(userVerified, userPo.getUserVerified())) return false;
        return true;
    }
}
