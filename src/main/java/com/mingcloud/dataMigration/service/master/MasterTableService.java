package com.mingcloud.dataMigration.service.master;

import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.service.BaseService;

import java.util.List;

public interface MasterTableService extends BaseService<MasterTableEntity> {
    /**
     * 查找数据库表所有列名称
     */
    List<MasterTableEntity> findMasterTableStructure(Object obj);
}
