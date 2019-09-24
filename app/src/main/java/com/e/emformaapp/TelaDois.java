package com.e.emformaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import static com.e.emformaapp.MainActivity.NOME_KEY_MAIN;

public class TelaDois extends AppCompatActivity {

    public Button btnVamos;
    public TextView txtTexto;
    public TextView txtIdade;
    public TextView txtAltura;
    public TextView txtPeso;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);

        txtTexto = findViewById(R.id.tdoisTextoTxt);
        txtIdade = findViewById(R.id.tdoisIdadeTxt);
        txtAltura = findViewById(R.id.tdoisAlturaTxt);
        txtPeso = findViewById(R.id.tdoisPesoTxt);

        btnVamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*                String localTexto = "Seja bem vindo" +(txtTexto).toString() + "!\n Esse é um aplicativo que\n" +
                        "te ajuda a saber e calcular o seu Indice de Massa \n" +
                        "Corporal";

                 */



                String localTexto = (txtTexto).getText().toString();


                if(!localTexto.isEmpty()) {


                    Intent intent = getIntent();

                    //Verificação para saber se o intent que está chegando não é null e não possui dados nulos
                    if (getIntent() != null && intent.getExtras() != null) {

                        //Variavel do tipo bundle que recebe as informações vindas do Intent
                        Bundle bundle = intent.getExtras();


                        String emails = bundle.getString(NOME_KEY_MAIN);
                    }


                }else{
                    Snackbar.make(btnVamos, "Algo deu errado", Snackbar.LENGTH_LONG).show();
                }



            }
        });


    }
}
