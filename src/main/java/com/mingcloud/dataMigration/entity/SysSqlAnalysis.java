package com.mingcloud.dataMigration.entity;


import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
//J2SE 提供的一个批注或者注解。该批注的作用是给编译器一条指令
//告诉它对被批注的代码元素内部的某些警告保持静默，即忽略这些警告信息。
public class SysSqlAnalysis {
	// 主键
    @Getter
    @Setter
    private String id;
    // 请求参数
    private String parameter;
    // mybatis mapper 命名空间
    private String mapper;
    // 完整sql 语句
    private String sqls;
    // sql 性能分析
    private String analysis;
 
    public String getParameter() {
        return parameter;
    }
 
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }
 
    public String getMapper() {
        return mapper;
    }
 
    public void setMapper(String mapper) {
        this.mapper = mapper == null ? null : mapper.trim();
    }
 
  
    public String getSqls() {
		return sqls;
	}
 
	public void setSqls(String sqls) {
		this.sqls = sqls;
	}
 
	public String getAnalysis() {
        return analysis;
    }
 
    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }
}