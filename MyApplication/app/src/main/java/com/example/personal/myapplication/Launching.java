package com.example.personal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Launching extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_launching);
        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(Launching.this, Signup.class));
            }
        }, 2000);
    }
}
