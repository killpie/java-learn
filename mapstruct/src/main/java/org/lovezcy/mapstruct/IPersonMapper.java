package org.lovezcy.mapstruct;

import org.lovezcy.entity.UserEntity;
import org.lovezcy.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = AttributeConvertUtil.class)
public interface IPersonMapper {
    IPersonMapper INSTANCE = Mappers.getMapper(IPersonMapper.class);
    @Mapping(target = "attributes", source = "attributes", qualifiedByName = "jsonToObject")
    @Mapping(target = "userNick1", source = "userNick")
    @Mapping(target = "createTime", source = "createTime", dateFormat = "yyyy-MM-dd")
    @Mapping(target = "age", source = "age", numberFormat = "#0.00")
 //   @Mapping(target = "id", ignore = true)
    @Mapping(target = "userVerified", defaultValue = "defaultValue-2")
    UserEntity po2entity(UserPo userPo);
}
