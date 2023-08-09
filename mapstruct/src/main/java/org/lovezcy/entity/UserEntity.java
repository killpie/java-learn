package org.lovezcy.entity;

import lombok.Data;
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
    private String userNick;
    private String userVerified;

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
        if (!Objects.equals(userNick, userPo.getUserNick())) return false;
        if (!Objects.equals(userVerified, userPo.getUserVerified())) return false;
        return true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(gmtCreate, that.gmtCreate) && Objects.equals(createTime, that.createTime) && Objects.equals(buyerId, that.buyerId) && Objects.equals(age, that.age) && Objects.equals(userNick, that.userNick) && Objects.equals(userVerified, that.userVerified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gmtCreate, createTime, buyerId, age, userNick, userVerified);
    }
}
