package com.mingcloud.dataMigration.mapper.cluster;


import com.mingcloud.dataMigration.entity.cluster.ClusterTableEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClusterTableMapper extends BaseMapper<ClusterTableEntity> {
    /**
     * 查找数据库表所有列名称
     */
    List<ClusterTableEntity> selectClusterTableStructure(Object obj);
}
