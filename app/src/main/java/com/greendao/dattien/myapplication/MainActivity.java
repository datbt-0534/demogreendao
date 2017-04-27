package com.greendao.dattien.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DataDao dataDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataDao = LocalDatabaseHelper.getInstance(this).getDaoSession().getDataDao();
    }

    private void addData(Data data) {
        dataDao.insert(data);
    }

    private void getData() {
        dataDao.queryBuilder().orderDesc(DataDao.Properties.Id).build().uniqueOrThrow();
    }

    private void deleteData(Data data) {
        dataDao.delete(data);
    }

    private void updateData(Data data) {
        dataDao.update(data);
    }
}
