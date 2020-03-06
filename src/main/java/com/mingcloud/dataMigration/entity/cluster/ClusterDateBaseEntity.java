package com.mingcloud.dataMigration.entity.cluster;

import lombok.Getter;
import lombok.Setter;

public class ClusterDateBaseEntity {
    @Setter
    @Getter
    private String dataBaseName;
    @Setter
    @Getter
    private String tableName;
}
