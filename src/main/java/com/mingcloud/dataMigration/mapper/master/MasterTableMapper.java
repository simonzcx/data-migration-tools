package com.mingcloud.dataMigration.mapper.master;


import com.mingcloud.dataMigration.entity.cluster.ClusterTableEntity;
import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MasterTableMapper extends BaseMapper<MasterTableEntity> {
    /**
     * 查找数据库表所有列名称
     */
    List<MasterTableEntity> selectMasterTableStructure(Object obj);
    void selectDataInto(Object obj);
}
