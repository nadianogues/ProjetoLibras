package com.example.projetoabcdalibra;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class tela_aprender extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener
{
    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM;
    Button btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
    Switch chaveVogalConsoante;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aprender);
        ActionBar title = getSupportActionBar();
        title.setTitle("Aprendendo o alfabeto");

        btnA = (Button)findViewById(R.id.btnA);
        btnA.setOnClickListener(this);
        btnB = (Button)findViewById(R.id.btnB);
        btnB.setOnClickListener(this);
        btnC = (Button)findViewById(R.id.btnC);
        btnC.setOnClickListener(this);
        btnD = (Button)findViewById(R.id.btnD);
        btnD.setOnClickListener(this);
        btnE = (Button)findViewById(R.id.btnE);
        btnE.setOnClickListener(this);
        btnF = (Button)findViewById(R.id.btnF);
        btnF.setOnClickListener(this);
        btnG = (Button)findViewById(R.id.btnG);
        btnG.setOnClickListener(this);
        btnH = (Button)findViewById(R.id.btnH);
        btnH.setOnClickListener(this);
        btnI = (Button)findViewById(R.id.btnI);
        btnI.setOnClickListener(this);
        btnJ = (Button)findViewById(R.id.btnJ);
        btnJ.setOnClickListener(this);
        btnK = (Button)findViewById(R.id.btnK);
        btnK.setOnClickListener(this);
        btnL = (Button)findViewById(R.id.btnL);
        btnL.setOnClickListener(this);
        btnM = (Button)findViewById(R.id.btnM);
        btnM.setOnClickListener(this);
        btnN = (Button)findViewById(R.id.btnN);
        btnN.setOnClickListener(this);
        btnO = (Button)findViewById(R.id.btnO);
        btnO.setOnClickListener(this);
        btnP = (Button)findViewById(R.id.btnP);
        btnP.setOnClickListener(this);
        btnQ = (Button)findViewById(R.id.btnQ);
        btnQ.setOnClickListener(this);
        btnR = (Button)findViewById(R.id.btnR);
        btnR.setOnClickListener(this);
        btnS = (Button)findViewById(R.id.btnS);
        btnS.setOnClickListener(this);
        btnT = (Button)findViewById(R.id.btnT);
        btnT.setOnClickListener(this);
        btnU = (Button)findViewById(R.id.btnU);
        btnU.setOnClickListener(this);
        btnV = (Button)findViewById(R.id.btnV);
        btnV.setOnClickListener(this);
        btnW = (Button)findViewById(R.id.btnW);
        btnW.setOnClickListener(this);
        btnX = (Button)findViewById(R.id.btnX);
        btnX.setOnClickListener(this);
        btnY = (Button)findViewById(R.id.btnY);
        btnY.setOnClickListener(this);
        btnZ = (Button)findViewById(R.id.btnZ);
        btnZ.setOnClickListener(this);

        chaveVogalConsoante = (Switch)findViewById(R.id.chaveVogalConsoante);
        chaveVogalConsoante.setOnCheckedChangeListener(this);
        chaveVogalConsoante.setTextOn("");
        chaveVogalConsoante.setTextOff("");


        btnA.setEnabled(false);
        btnE.setEnabled(false);
        btnI.setEnabled(false);
        btnO.setEnabled(false);
        btnU.setEnabled(false);

        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnV.setEnabled(true);
        btnX.setEnabled(true);
        btnW.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);
    }

    @Override
    public void onClick(View v)
    {
        Button btn = (Button)findViewById(v.getId());
        Intent i = new Intent(this, tela_video.class);
        Bundle b = new Bundle();
        b.putString("letra", btn.getText().toString());
        i.putExtras(b);
        startActivity(i);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        if(isChecked)
        {
            btnA.setEnabled(true);
            btnE.setEnabled(true);
            btnI.setEnabled(true);
            btnO.setEnabled(true);
            btnU.setEnabled(true);

            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
            btnJ.setEnabled(false);
            btnK.setEnabled(false);
            btnL.setEnabled(false);
            btnM.setEnabled(false);
            btnN.setEnabled(false);
            btnP.setEnabled(false);
            btnQ.setEnabled(false);
            btnR.setEnabled(false);
            btnS.setEnabled(false);
            btnT.setEnabled(false);
            btnV.setEnabled(false);
            btnX.setEnabled(false);
            btnW.setEnabled(false);
            btnY.setEnabled(false);
            btnZ.setEnabled(false);

        }
        else
        {
            btnA.setEnabled(false);
            btnE.setEnabled(false);
            btnI.setEnabled(false);
            btnO.setEnabled(false);
            btnU.setEnabled(false);

            btnB.setEnabled(true);
            btnC.setEnabled(true);
            btnD.setEnabled(true);
            btnF.setEnabled(true);
            btnG.setEnabled(true);
            btnH.setEnabled(true);
            btnJ.setEnabled(true);
            btnK.setEnabled(true);
            btnL.setEnabled(true);
            btnM.setEnabled(true);
            btnN.setEnabled(true);
            btnP.setEnabled(true);
            btnQ.setEnabled(true);
            btnR.setEnabled(true);
            btnS.setEnabled(true);
            btnT.setEnabled(true);
            btnV.setEnabled(true);
            btnX.setEnabled(true);
            btnW.setEnabled(true);
            btnY.setEnabled(true);
            btnZ.setEnabled(true);
        }
    }
}
