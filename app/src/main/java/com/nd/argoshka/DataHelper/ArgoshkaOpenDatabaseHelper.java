package com.nd.argoshka.DataHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.nd.argoshka.DataHelper.Tables.Client;
import com.nd.argoshka.DataHelper.Tables.Goods;
import com.nd.argoshka.DataHelper.Tables.Order;

public class ArgoshkaOpenDatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final int ARGOSHKA_DATABASE_VERSION = 1;
    private static final String ARGOSHKA_DATABASE_NAME = "ArgoshkaDB";

    private Dao<Client,Long> daoClients;
    private Dao<Order,Long> daoOrders;
    private Dao<Goods,Long> daoGoods;

    public ArgoshkaOpenDatabaseHelper(Context context) {
        super(context, ARGOSHKA_DATABASE_NAME, null, ARGOSHKA_DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
