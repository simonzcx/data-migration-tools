package com.mingcloud.dataMigration.controller.cluster;


import com.alibaba.fastjson.JSONObject;
import com.mingcloud.dataMigration.common.ServiceResponse;
import com.mingcloud.dataMigration.entity.cluster.ClusterDateBaseEntity;
import com.mingcloud.dataMigration.entity.cluster.ClusterTableEntity;
import com.mingcloud.dataMigration.service.cluster.ClusterDataBaseService;
import com.mingcloud.dataMigration.service.cluster.ClusterTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cluster")
public class ClusterDataBaseController {

    @Autowired
    private ClusterDataBaseService clusterDataBaseService;

    @Autowired
    private ClusterTableService clusterTableService;

    @RequestMapping(value = "/findAllTableName",method = RequestMethod.POST)
    public ServiceResponse<List<ClusterDateBaseEntity>> findAllTableName(){
        List<ClusterDateBaseEntity> list = clusterDataBaseService.findAllTableName();
        return ServiceResponse.ok(list);
    }

    @RequestMapping(value = "/findClusterTableStructure",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ServiceResponse<List<ClusterTableEntity>> findClusterTableStructure(@RequestBody JSONObject jsonParam){
        String tableName = "\"" + jsonParam.getString("tableName") + "\"";
        ClusterTableEntity entity = new ClusterTableEntity();
        entity.setTableName(tableName);
        List<ClusterTableEntity> list = clusterTableService.findClusterTableStructure(entity);
        return ServiceResponse.ok(list);
    }


}
