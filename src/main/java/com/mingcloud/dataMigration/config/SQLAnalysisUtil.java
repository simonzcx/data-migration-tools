package com.mingcloud.dataMigration.config;
 
import java.sql.SQLException;

import com.mingcloud.dataMigration.entity.SysSqlAnalysis;
import org.springframework.jdbc.core.JdbcTemplate;
 
public class SQLAnalysisUtil {
	private JdbcTemplate template;
 
	// set 和 get 方法
	public JdbcTemplate getTemplate() {
		return template;
	}
 
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// 新增sql
	String insert = "insert into sys_sql_analysis(id, parameter, mapper, sqls) values (?,?,?,?)";
	
	/**
	 * sys_cron 插入
	 * 
	 * @param entity
	 * @throws SQLException
	 */
	public void insert(SysSqlAnalysis entity) throws SQLException {
		template.update(insert, entity.getId(), entity.getParameter(), entity.getMapper(), entity.getSqls());
	}
}