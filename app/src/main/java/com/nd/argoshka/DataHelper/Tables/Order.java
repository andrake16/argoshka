package com.nd.argoshka.DataHelper.Tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Orders")
public class Order {

    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField()
    private String textOfOrder;

}
