package com.mingcloud.dataMigration.mapper.master;

import com.mingcloud.dataMigration.entity.master.User;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserMapper
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    
}
