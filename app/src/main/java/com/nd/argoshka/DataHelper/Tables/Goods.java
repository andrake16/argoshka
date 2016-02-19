package com.nd.argoshka.DataHelper.Tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Goods {

    @DatabaseField
    private Long id;

    @DatabaseField
    private String type;

}
