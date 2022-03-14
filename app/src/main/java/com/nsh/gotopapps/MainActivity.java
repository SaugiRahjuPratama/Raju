package com.nsh.gotopapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    public void clickRS(View view) {
        //gambar RS di Click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
}