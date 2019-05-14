package com.example.projetoabcdalibra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity implements View.OnClickListener
{

    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        btnJogar = (Button)findViewById(R.id.btnJogar);
        btnJogar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v == btnJogar)
        {
            Intent i = new Intent(this, TelaOpcoes.class);
            startActivity(i);
        }
    }
}
