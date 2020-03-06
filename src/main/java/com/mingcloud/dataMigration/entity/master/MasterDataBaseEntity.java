package com.mingcloud.dataMigration.entity.master;

import lombok.Getter;
import lombok.Setter;

public class MasterDataBaseEntity {
    @Setter
    @Getter
    private String dataBaseName;
    @Setter
    @Getter
    private String tableName;
}
