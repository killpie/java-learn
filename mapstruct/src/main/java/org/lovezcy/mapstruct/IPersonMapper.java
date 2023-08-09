package org.lovezcy.mapstruct;

import org.lovezcy.entity.UserEntity;
import org.lovezcy.po.UserPo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPersonMapper {
    IPersonMapper INSTANCE = Mappers.getMapper(IPersonMapper.class);
    UserEntity po2entity(UserPo userPo);
}
