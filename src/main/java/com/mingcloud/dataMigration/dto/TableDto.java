package com.mingcloud.dataMigration.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

public class TableDto {
    @Setter
    @Getter
    private String newTable;
    @Setter
    @Getter
    private String oldTable;

    public LinkedHashMap<String,Object> map = new LinkedHashMap<>();
}
