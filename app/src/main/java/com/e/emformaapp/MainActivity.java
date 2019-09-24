package com.e.emformaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    public TextInputLayout txtNome;
    public TextInputLayout txtIdade;
    public TextInputLayout txtAltura;
    public TextInputLayout txtPeso;
    public Button btnComecar;


    public static final String NOME_KEY_MAIN = "Nome";
    public static final String IDADE_KEY_MAIN = "Idade";
    public static final String PESO_KEY_MAIN = "Peso";
    public static final String ALTURA_KEY_MAIN = "Altura";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        /*
        txtNome = findViewById(R.id.mainNomeTxt);
        txtIdade = findViewById(R.id.mainIdadeTxt);
        txtAltura = findViewById(R.id.mainAlturaTxt);
        txtPeso = findViewById(R.id.mainPesoTxt);
        */

        btnComecar = findViewById(R.id.mainStartBtn);

        btnComecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this, TelaDois.class));


            }
        });



    }
}
