package com.example.projetoabcdalibra;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

public class tela_video extends AppCompatActivity
{
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_video);

        ActionBar title = getSupportActionBar();
        title.setTitle(" ");

        Intent i = getIntent();
        if(i != null)
        {
            Bundle caixa = new Bundle();
            caixa = i.getExtras();

            //testa se o bundle veio realmente
            if(caixa != null)
            {
                if(caixa.getString("letra").toUpperCase().equals('A'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('B'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.b));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('C'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.c));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('D'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.d));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('E'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.e));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('F'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.f));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('G'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.g));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('H'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.h));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('I'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.i));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('J'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.j));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }else if(caixa.getString("letra").toUpperCase().equals('K'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.k));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('L'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.l));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('M'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.m));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('N'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.n));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('O'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.o));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('P'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.p));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('Q'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.q));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('R'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.r));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('S'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.s));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('T'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.t));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('U'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.u));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('V'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('W'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.w));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('X'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.x));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('Y'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.y));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }
                else if(caixa.getString("letra").toUpperCase().equals('Z'))
                {
                    video = (VideoView)findViewById(R.id.video);
                    video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.z));
                    MediaController controle = new MediaController(this);
                    video.setMediaController(controle);
                    video.start();
                }

            }
        }

    }


}
