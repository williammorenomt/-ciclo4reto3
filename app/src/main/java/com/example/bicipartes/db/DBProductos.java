package com.example.bicipartes.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;


public class DBProductos extends dbHelper{

    Context context;

    public DBProductos(@Nullable Context context){
        super(context);
        this.context = context;
    }

    public long insertarProducto(String nombre, String marca, String cantidad, String precio){
        long id = 0;
        try {
            dbHelper dbHelper = new dbHelper(context);
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("marca", marca);
            values.put("cantidad", cantidad);
            values.put("precio", precio);

             id = db.insert(TABLE_PRODUCTOS, null, values);
        } catch (Exception ex){
            ex.toString();
        }
                return id;
    }
}
