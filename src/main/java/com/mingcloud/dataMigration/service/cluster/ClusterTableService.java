package com.mingcloud.dataMigration.service.cluster;

import com.mingcloud.dataMigration.entity.cluster.ClusterTableEntity;
import com.mingcloud.dataMigration.service.BaseService;

import java.util.List;

public interface ClusterTableService extends BaseService<ClusterTableEntity> {
    /**
     * 查找数据库表所有列名称
     */
    List<ClusterTableEntity> findClusterTableStructure(Object obj);
}
