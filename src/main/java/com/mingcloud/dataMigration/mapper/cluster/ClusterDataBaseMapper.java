package com.mingcloud.dataMigration.mapper.cluster;


import com.mingcloud.dataMigration.entity.cluster.ClusterDateBaseEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClusterDataBaseMapper extends BaseMapper<ClusterDateBaseEntity> {

}
