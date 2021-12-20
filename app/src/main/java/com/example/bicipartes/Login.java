package com.example.bicipartes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText ed_Correo,ed_Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ed_Correo = (EditText) findViewById(R.id.edCorreoInicio);
        ed_Contraseña = (EditText) findViewById(R.id.edContraseñaInicio);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_icon);


    }

    public void Registrar(View v){
        Toast.makeText(this,"Ingresar al registro",Toast.LENGTH_SHORT).show();
        Intent in = new Intent(Login.this,registro.class);
        startActivity(in);
    }

    public void Ingresar(View v){
        Toast.makeText(this,"Ingresar al Inicio",Toast.LENGTH_SHORT).show();
        Intent in = new Intent(Login.this,Inicio.class);
        startActivity(in);
    }

}