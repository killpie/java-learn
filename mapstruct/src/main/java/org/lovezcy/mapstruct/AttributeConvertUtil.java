package org.lovezcy.mapstruct;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.lovezcy.po.Attributes;
import org.mapstruct.Named;

/**
 * @Auther: killpie
 * @Date: 2023/8/10 23:23
 * @Description: AttributeConvertUtil
 */
public class AttributeConvertUtil {
    /**
     * json字符串转对象
     *
     * @param jsonStr
     * @return
     */
    @Named("jsonToObject")
    public Attributes jsonToObject(String jsonStr) {
        if (StringUtils.isEmpty(jsonStr)) {
            return null;
        }
        return new Gson().fromJson(jsonStr, Attributes.class);
    }
}
