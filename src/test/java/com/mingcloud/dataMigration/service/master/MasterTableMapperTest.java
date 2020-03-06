package com.mingcloud.dataMigration.service.master;

import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import com.mingcloud.dataMigration.mapper.master.MasterTableMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MasterTableMapperTest {

    @Autowired
    private MasterTableService masterTableService;

    @Test
   public void testSelectAll(){
        MasterTableEntity entity = new MasterTableEntity();
        entity.setTableName("app");
        List<MasterTableEntity> list = masterTableService.findMasterTableStructure(entity);
        for (MasterTableEntity entity1: list) {
            System.out.println(entity1.getColumnName()+"           "+entity1.getDataType()+"           "+entity1.getColumnComment());
        }
    }

}
