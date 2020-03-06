package com.mingcloud.dataMigration.mapper.master;

import com.mingcloud.dataMigration.entity.master.MasterTableEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MasterTableMapperTest {

    @Autowired
    private MasterTableMapper masterTableMapper;

    //@Test
   /* public void testSelectAll(){
        List<MasterTableEntity> list = masterTableMapper.findAll();
        for (MasterTableEntity entity: list) {
            System.out.println(entity.getName());
        }
    }*/
    @Test
   public void testSelectAll(){
        MasterTableEntity entity = new MasterTableEntity();
        entity.setTableName("app");
        List<MasterTableEntity> list = masterTableMapper.selectMasterTableStructure(entity);
        for (MasterTableEntity entity1: list) {
            System.out.println(entity1.getColumnName()+"           "+entity1.getDataType()+"           "+entity1.getColumnComment());
        }
    }

}
