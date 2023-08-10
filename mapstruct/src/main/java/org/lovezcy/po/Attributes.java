package org.lovezcy.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: killpie
 * @Date: 2023/8/10 23:22
 * @Description: Attributes
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Attributes {
    private Long id;
    private String name;
}
