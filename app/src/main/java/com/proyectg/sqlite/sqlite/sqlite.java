package com.proyectg.sqlite.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class sqlite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        //inicializamos la bd.
        bd_utils baseDatos = new bd_utils(this,"peliculas",null,1);
    }
}
