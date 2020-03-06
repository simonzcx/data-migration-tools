package com.mingcloud.dataMigration.service.impl.cluster;

import com.mingcloud.dataMigration.entity.cluster.ClusterTableEntity;
import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.cluster.ClusterTableMapper;
import com.mingcloud.dataMigration.service.cluster.ClusterTableService;
import com.mingcloud.dataMigration.service.impl.BaseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClusterTableServiceImpl extends BaseServiceImpl<ClusterTableEntity> implements ClusterTableService {
    private static final Logger logger= LoggerFactory.getLogger(BaseServiceImpl.class);

    @Autowired
    private ClusterTableMapper clusterTableMapper;

    @Override
    protected BaseMapper<ClusterTableEntity> getMapper() {
        return this.clusterTableMapper;
    }

    @Override
    public List<ClusterTableEntity> findClusterTableStructure(Object obj) {
        List<ClusterTableEntity> list = null;
        try {
            list =  clusterTableMapper.selectClusterTableStructure(obj);
        } catch (Exception e) {
            logger.error("查询失败!原因是:",e);
        }
        return list;
    }

}
