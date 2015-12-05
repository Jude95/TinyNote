package cn.com.caoyue.tinynote;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MessageDB extends SQLiteOpenHelper {

    public static final String CREATE_USERDATABASE = "create table MessageDB ("
            + "id integer primary key autoincrement, "
            + "time TimeStamp NOT NULL DEFAULT (datetime('now','localtime')), "
            + "sign integer default 0, "
            + "message text)";

    private Context context;

    public MessageDB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USERDATABASE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
