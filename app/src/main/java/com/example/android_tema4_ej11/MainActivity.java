package com.example.android_tema4_ej11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b = findViewById(R.id.bt1);
        TextView tv1 = findViewById(R.id.tvSalida);

        b.setOnClickListener(view -> accionBoton(tv1));
    }

    private void accionBoton(TextView tv1) {

        String mensaje = "";

        if (retornaNum() == 30) {
            mensaje = getResources().getString(R.string.good_option);
            tv1.setText(mensaje);

        } else if (retornaNum() < 30) {
            mensaje = getResources().getString(R.string.smaller_option);
            tv1.setText(mensaje);

        } else {
            mensaje = getResources().getString(R.string.higher_option);
            tv1.setText(mensaje);
        }
    }


    private int retornaNum() {

        EditText et= (EditText) findViewById(R.id.et1);
        return Integer.parseInt(et.getText().toString());

    }


}