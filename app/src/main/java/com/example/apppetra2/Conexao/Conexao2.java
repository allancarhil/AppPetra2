package com.example.apppetra2.Conexao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao2 extends SQLiteOpenHelper {

    private static final String name="banco.db";
    private static final int version=1;

    public Conexao2(@Nullable Context context) {
        super(context, name, null, version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("SELECT * FROM us36 WHERE data=data");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
