package com.nd.argoshka.DataHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.nd.argoshka.DataHelper.Tables.Client;
import com.nd.argoshka.DataHelper.Tables.Goods;
import com.nd.argoshka.DataHelper.Tables.Order;

import java.sql.SQLException;

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
        try {
            TableUtils.createTable(connectionSource,Client.class);
            TableUtils.createTable(connectionSource,Goods.class);
            TableUtils.createTable(connectionSource,Order.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource,Client.class,false);
            TableUtils.dropTable(connectionSource,Goods.class,false);
            TableUtils.dropTable(connectionSource,Order.class,false);
            onCreate(database,connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Dao<Client,Long> getDaoClients() throws SQLException {
        if(daoClients == null) {
            daoClients = getDao(Client.class);
        }
        return daoClients;
    }

    public Dao<Order,Long> getDaoOrders() throws SQLException {
        if(daoOrders == null) {
            daoOrders = getDao(Order.class);
        }

        return daoOrders;
    }

    public Dao<Goods,Long> getDaoGoods() throws SQLException {
        if(daoGoods == null) {
            daoGoods = getDao(Goods.class);
        }

        return daoGoods;
    }


}
