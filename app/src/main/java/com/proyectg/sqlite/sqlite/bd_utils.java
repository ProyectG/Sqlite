package com.proyectg.sqlite.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

/**
 * Created by proyectg on 31-05-2017.
 */

public class bd_utils extends SQLiteOpenHelper {


    public bd_utils(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creamos una tabla que solo aceptara nombre de la pelicula y su rating.
        db.execSQL("create table pelicula(nombre text,rating integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Ante una actualizacion volver a 0, se pueden agregar cosas nuevas si no producen conflictos eliminar todo es la solucion mas simple.
            db.execSQL("drop table if exists pelicula");
            db.execSQL("create table pelicula(nombre text,rating integer)");

    }
}
