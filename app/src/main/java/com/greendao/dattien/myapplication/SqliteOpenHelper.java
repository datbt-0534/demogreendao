package com.greendao.dattien.myapplication;

import android.content.Context;

import org.greenrobot.greendao.database.Database;

/**
 * Created by haipq on 12/20/16.
 */

/**
 * Use this for migration
 */
public class SqliteOpenHelper extends DaoMaster.DevOpenHelper {

    public SqliteOpenHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
