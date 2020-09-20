package com.sameer.mccexp13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toOwn(View view){
        Intent i=new Intent(MainActivity.this,ownmap.class);
        startActivity(i);
    }
    public void toDist(View view){
        Intent i=new Intent(MainActivity.this,cityfinder.class);
        startActivity(i);
    }
}