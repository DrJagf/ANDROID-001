package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Selection_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);



       Button btnSiguiente = findViewById(R.id.btnSiguiente);
       btnSiguiente.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               doCambiarPantalla();

           }
       });

    }

    private void doCambiarPantalla(){

        CheckBox chPollo = findViewById(R.id.chkOpcionPollo);
        CheckBox chCarne = findViewById(R.id.chkOpcionCarne);
        CheckBox chPescado = findViewById(R.id.chkOpcionPescado);
        CheckBox chPasta = findViewById(R.id.chkOpcionPasta);
        CheckBox chEnsalada = findViewById(R.id.chkOpcionEnsalada);

        boolean isPollo = chPollo.isChecked();
        boolean isCarne = chCarne.isChecked();
        boolean isPescado = chPescado.isChecked();
        boolean isPasta = chPasta.isChecked();
        boolean isEnsalada = chEnsalada.isChecked();


        Intent intent = new  Intent (getApplicationContext(), centralOperations.class);
        intent.putExtra( centralOperations.DATO_POLLO , isPollo);
        intent.putExtra( centralOperations.DATO_CARNE , isCarne);
        intent.putExtra( centralOperations.DATO_PESCADO , isPescado);
        intent.putExtra( centralOperations.DATO_PASTA , isPasta);
        intent.putExtra( centralOperations.DATO_ENSALADA , isEnsalada);
        startActivity(intent);


    }




}
