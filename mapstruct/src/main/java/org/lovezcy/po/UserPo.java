package org.lovezcy.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Auther: killpie
 * @Date: 2023/8/8 23:31
 * @Description: UserPo
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPo {
    private Long id;
    private Date gmtCreate;
    private Date createTime;
    private Long buyerId;
    private Long age;
    private String userNick;
    private String userVerified;
}
