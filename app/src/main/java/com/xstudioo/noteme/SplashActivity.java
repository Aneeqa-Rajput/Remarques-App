package com.xstudioo.noteme;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    ImageView note;
    TextView name;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        note=(ImageView)findViewById(R.id.imageView4);
        name=(TextView)findViewById(R.id.textView2);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        Intent mainActCall=getIntent();
        boolean flag=mainActCall.getBooleanExtra("flag",true);
        //flag=false;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent callMainAct=new Intent(getApplicationContext(), MainActivity.class);
                callMainAct.putExtra("flag1",false);
                startActivity(callMainAct);
            }
        }, 2000);

    }
}