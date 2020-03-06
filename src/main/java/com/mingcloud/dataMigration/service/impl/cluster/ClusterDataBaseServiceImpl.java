package com.mingcloud.dataMigration.service.impl.cluster;

import com.mingcloud.dataMigration.entity.cluster.ClusterDateBaseEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.cluster.ClusterDataBaseMapper;
import com.mingcloud.dataMigration.service.cluster.ClusterDataBaseService;
import com.mingcloud.dataMigration.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClusterDataBaseServiceImpl extends BaseServiceImpl<ClusterDateBaseEntity> implements ClusterDataBaseService {
    @Autowired
    private ClusterDataBaseMapper clusterDataBaseMapper;

    @Override
    protected BaseMapper<ClusterDateBaseEntity> getMapper() {
        return this.clusterDataBaseMapper;
    }
}
