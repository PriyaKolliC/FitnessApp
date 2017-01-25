package com.example.personal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TabHost;

public class Signup extends AppCompatActivity {
TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signup);
        TabHost host=(TabHost)findViewById(R.id.tabsst);
        host.setup();
        TabHost.TabSpec spec=host.newTabSpec("Tab One");
        spec.setContent(R.id.SignIn);
        spec.setIndicator("SignIn");
        host.addTab(spec);
        spec=host.newTabSpec("Tab Two");
        spec.setContent(R.id.SignUp);
        spec.setIndicator("SignUp");
        host.addTab(spec);

    }
}
