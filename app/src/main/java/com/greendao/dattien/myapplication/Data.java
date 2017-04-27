package com.greendao.dattien.myapplication;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by FRAMGIA\bui.tien.dat on 27/04/2017.
 */
@Entity(nameInDb = "Data")
public class Data {
    @Id
    private long id;
    private String type;

    @Generated(hash = 2106500334)
    public Data(long id, String type) {
        this.id = id;
        this.type = type;
    }

    @Generated(hash = 2135787902)
    public Data() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
