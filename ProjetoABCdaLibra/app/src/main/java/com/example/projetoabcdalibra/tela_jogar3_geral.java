package com.example.projetoabcdalibra;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tela_jogar3_geral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogar3_geral);

        ActionBar title = getSupportActionBar();
        title.setTitle(" ");
    }
}
