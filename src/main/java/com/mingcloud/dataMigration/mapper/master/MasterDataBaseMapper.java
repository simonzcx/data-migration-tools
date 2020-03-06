package com.mingcloud.dataMigration.mapper.master;


import com.mingcloud.dataMigration.entity.master.MasterDataBaseEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MasterDataBaseMapper extends BaseMapper<MasterDataBaseEntity> {

}
