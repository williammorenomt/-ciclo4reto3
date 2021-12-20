package com.example.bicipartes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bicipartes.db.DBProductos;

public class NuevoProductoActivity extends AppCompatActivity {

    EditText txtNombre, txtMarca, txtPrecio, txtCantidad;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_producto);

        txtNombre = findViewById(R.id.txtnombre);
        txtMarca = findViewById(R.id.txtmarca);
        txtPrecio = findViewById(R.id.txtprecio);
        txtCantidad = findViewById(R.id.txtcantidad);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBProductos dbProductos = new DBProductos(NuevoProductoActivity.this);
                long id = dbProductos.insertarProducto(txtNombre.getText().toString(),txtCantidad.getText().toString(),txtMarca.getText().toString(),txtPrecio.getText().toString());

                if(id>0){
                    Toast.makeText(NuevoProductoActivity.this, "Registro Guardado", Toast.LENGTH_SHORT).show();
                    limpiar();
                }else{
                    Toast.makeText(NuevoProductoActivity.this,"Error al guardar registro", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void limpiar(){
        txtNombre.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
    }
}