package com.nd.argoshka.DataHelper.Tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Clients")
public class Client {

    @DatabaseField(generatedId = true)
    private Long id;

    @DatabaseField(columnName = "name")
    private String name;

    @DatabaseField(columnName = "surName")
    private String surName;

    @DatabaseField(columnName = "patronymic")
    private String patronymic;

    @DatabaseField
    private String phoneNumber;

    @DatabaseField
    private Date dateCreated;

}
