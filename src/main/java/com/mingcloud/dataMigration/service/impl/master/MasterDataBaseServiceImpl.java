package com.mingcloud.dataMigration.service.impl.master;

import com.mingcloud.dataMigration.entity.master.MasterDataBaseEntity;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import com.mingcloud.dataMigration.mapper.master.MasterDataBaseMapper;
import com.mingcloud.dataMigration.service.impl.BaseServiceImpl;
import com.mingcloud.dataMigration.service.master.MasterDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterDataBaseServiceImpl extends BaseServiceImpl<MasterDataBaseEntity> implements MasterDataBaseService {
    @Autowired
    private MasterDataBaseMapper masterDataBaseMapper;

    @Override
    protected BaseMapper<MasterDataBaseEntity> getMapper() {
        return this.masterDataBaseMapper;
    }

}
