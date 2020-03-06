package com.mingcloud.dataMigration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;


@SpringBootApplication
@MapperScan(basePackages = "com.mingcloud.dataMigration.mapper",annotationClass = Repository.class)
public class DataMigrationToolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMigrationToolsApplication.class, args);
	}

}
