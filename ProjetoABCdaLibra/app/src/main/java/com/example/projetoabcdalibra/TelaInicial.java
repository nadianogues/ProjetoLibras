package com.example.projetoabcdalibra;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity implements View.OnClickListener
{

    private Button btnJogar, btnAprender;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        btnJogar = (Button)findViewById(R.id.btnJogar);
        btnJogar.setOnClickListener(this);

        btnAprender = (Button)findViewById(R.id.btnAprender);
        btnAprender.setOnClickListener(this);

        ActionBar title = getSupportActionBar();
        title.setTitle("ABC Libras");
    }

    @Override
    public void onClick(View v)
    {
        if(v == btnJogar)
        {
            Intent i = new Intent(this, TelaOpcoes.class);
            startActivity(i);
        }
        if(v == btnAprender)
        {
            Intent i = new Intent(this, tela_aprender.class);
            startActivity(i);
        }
    }
}
