package com.example.projetoabcdalibra;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaOpcoes extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);

        ActionBar title = getSupportActionBar();
        title.setTitle("Escolha uma das opções");
    }
}
