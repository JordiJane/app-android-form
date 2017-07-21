package com.example.jordi.aplicacion;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity  {
    private static final String TAG = "MAINACTIVITY";
    Button siguiente;
    EditText editTextNom;
    EditText editTextTelefon;
    EditText editTextEmail;
    EditText editTextDescripcion;
    TextView textViewDataNacimiento;
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplayDate = (TextView) findViewById(R.id.fechaNacimiento);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this,android.R.style.Theme_Holo_Light_Dialog_MinWidth,mDateSetListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG,"onDateSet: mm/dd/yyy" + month + "/" + day + "/" + year);
                String date = day + "/" + month + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        siguiente = (Button) findViewById(R.id.button);
        editTextNom = (EditText) findViewById(R.id.usuario);
        editTextTelefon = (EditText) findViewById(R.id.telefono);
        editTextEmail = (EditText) findViewById(R.id.email);
        editTextDescripcion = (EditText) findViewById(R.id.descripcionUsuario);
        textViewDataNacimiento = (TextView) findViewById(R.id.fechaNacimiento);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this,Main2Activity.class);
                siguiente.putExtra(Main2Activity.BUNDLE_USER_NAME,editTextNom.getText().toString());
                siguiente.putExtra(Main2Activity.BUNDLE_NACIMIENTO,textViewDataNacimiento.getText().toString());
                siguiente.putExtra(Main2Activity.BUNDLE_TELEFONO,editTextTelefon.getText().toString());
                siguiente.putExtra(Main2Activity.BUNDLE_EMAIL,editTextEmail.getText().toString());
                siguiente.putExtra(Main2Activity.BUNDLE_DESCRIPCION,editTextDescripcion.getText().toString());
                startActivity(siguiente);
            }
        });
    }
}
