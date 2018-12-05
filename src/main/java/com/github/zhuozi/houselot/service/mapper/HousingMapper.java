package com.github.zhuozi.houselot.service.mapper;

import com.github.zhuozi.houselot.service.entity.HousingEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Email: zhuozi@meili-inc.com
 * Datetime: 2018-12-05 20:56
 */
@Mapper
public interface HousingMapper {

    public Long insert(HousingEntity entity);

    public Integer update(HousingEntity entity, Long id);

    @Delete("delete from Housing where id = #{id} limit 1")
    public Integer delete(@Param("id") Long id);
}
