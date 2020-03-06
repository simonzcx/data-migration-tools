package com.mingcloud.dataMigration.controller.master;


import com.alibaba.fastjson.JSONObject;
import com.mingcloud.dataMigration.common.ServiceResponse;
import com.mingcloud.dataMigration.entity.master.MasterDataBaseEntity;
import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.service.master.MasterDataBaseService;
import com.mingcloud.dataMigration.service.master.MasterTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/master")
public class MasterDataBaseController {

    @Autowired
    private MasterDataBaseService masterDataBaseService;

    @Autowired
    private MasterTableService masterTableService;

    @RequestMapping(value = "/findAllTableName",method = RequestMethod.POST)
    public ServiceResponse<List<MasterDataBaseEntity>> findAllTableName(){
        List<MasterDataBaseEntity> list = masterDataBaseService.findAllTableName();
        return ServiceResponse.ok(list);
    }

    @RequestMapping(value = "/findMasterTableStructure",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ServiceResponse<List<MasterTableEntity>> findMasterTableStructure(@RequestBody JSONObject jsonParam){
        String tableName = "\"" + jsonParam.getString("tableName") + "\"";
        MasterTableEntity entity = new MasterTableEntity();
        entity.setTableName(tableName);
        List<MasterTableEntity> list = masterTableService.findMasterTableStructure(entity);
        return ServiceResponse.ok(list);
    }

}
