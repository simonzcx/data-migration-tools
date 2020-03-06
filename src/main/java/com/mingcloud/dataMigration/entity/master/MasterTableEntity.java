package com.mingcloud.dataMigration.entity.master;

import lombok.Getter;
import lombok.Setter;

public class MasterTableEntity {
    @Setter
    @Getter
    private String tableName;
    @Setter
    @Getter
    private String columnName;
    @Setter
    @Getter
    private String dataType;
    @Setter
    @Getter
    private String columnComment;
}
