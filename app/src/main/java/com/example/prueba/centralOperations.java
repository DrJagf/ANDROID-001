 package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

 public class centralOperations extends AppCompatActivity {

     public static final String DATO_POLLO = "DATO_POLLO";
     public static final String DATO_CARNE = "DATO_CARNE";
     public static final String DATO_PESCADO = "DATO_PESCADO";
     public static final String DATO_PASTA = "DATO_PASTA";
     public static final String DATO_ENSALADA = "DATO_ENSALADA";

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_operations);

        initView();
    }

    private void initView(){
        Button btn = findViewById(R.id.act_central_op_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Esto es una prueba", Snackbar.LENGTH_LONG)
                        .show();
            }
        });

    }




     private void getOption(){



    }




}
