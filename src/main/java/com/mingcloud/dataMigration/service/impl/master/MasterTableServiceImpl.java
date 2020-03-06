package com.mingcloud.dataMigration.service.impl.master;

import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.master.MasterTableMapper;
import com.mingcloud.dataMigration.service.impl.BaseServiceImpl;
import com.mingcloud.dataMigration.service.master.MasterDataBaseService;
import com.mingcloud.dataMigration.service.master.MasterTableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MasterTableServiceImpl extends BaseServiceImpl<MasterTableEntity> implements MasterTableService {
    private static final Logger logger= LoggerFactory.getLogger(BaseServiceImpl.class);
    @Autowired
    private MasterTableMapper masterTableMapper;

    @Override
    protected BaseMapper<MasterTableEntity> getMapper() {
        return this.masterTableMapper;
    }

    @Override
    public List<MasterTableEntity> findMasterTableStructure(Object obj) {
        List<MasterTableEntity> list = null;
        try {
            list =  masterTableMapper.selectMasterTableStructure(obj);
        } catch (Exception e) {
            logger.error("查询失败!原因是:",e);
        }
        return list;
    }
}
