package com.e.emformaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //esconder a Action Bar
        getSupportActionBar().hide();
        //Activity seja exibida em full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //StartActivity>nova Intentet(Contexto da aplicação, e qual activity será aberta.
                //Coloca-se o finish, para o caso do usuário apertar voltar e ele não voltar para a tela de Splash

                startActivity(new Intent(getBaseContext(),MainActivity.class));
                finish();
            }
        },1000);

    }
}