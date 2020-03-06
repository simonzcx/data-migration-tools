package com.mingcloud.dataMigration.mapper.cluster;

import com.mingcloud.dataMigration.entity.cluster.Student;
import com.mingcloud.dataMigration.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * StudentMapper
 */
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {

}
