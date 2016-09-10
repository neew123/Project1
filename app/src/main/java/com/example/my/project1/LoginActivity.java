package com.example.my.project1;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class LoginActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        toolbar1.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar1.setTitle("Welcome");
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
