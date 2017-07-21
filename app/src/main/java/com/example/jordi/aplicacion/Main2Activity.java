package com.example.jordi.aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    public static final String BUNDLE_USER_NAME = "userName";
    public static final String BUNDLE_TELEFONO = "telefono";
    public static final String BUNDLE_EMAIL = "email";
    public static final String BUNDLE_DESCRIPCION = "descripcion";
    public static final String BUNDLE_NACIMIENTO = "nacimiento";
    Button anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle parametros = getIntent().getExtras();
        final String usuario = parametros.getString(BUNDLE_USER_NAME);
        String nacimiento = parametros.getString(BUNDLE_NACIMIENTO);
        String telefono = parametros.getString(BUNDLE_TELEFONO);
        String email = parametros.getString(BUNDLE_EMAIL);
        String descripcion = parametros.getString(BUNDLE_DESCRIPCION);
        final TextView textViewUsuario = (TextView) findViewById(R.id.usuario);
        TextView textViewDataNacimiento = (TextView) findViewById(R.id.fechaNacimiento2);
        TextView textViewTelefono = (TextView) findViewById(R.id.telefono);
        TextView textViewEmail = (TextView) findViewById(R.id.email);
        TextView textViewDescripcion = (TextView) findViewById(R.id.descripcion);
        anterior = (Button) findViewById(R.id.editar_Datos);
        textViewUsuario.setText(usuario);
        textViewTelefono.setText(telefono);
        textViewEmail.setText(email);
        textViewDescripcion.setText(descripcion);
        textViewDataNacimiento.setText(nacimiento);

        anterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anterior = new Intent(Main2Activity.this,MainActivity.class);
                finish();
            }
        });


    }
}
