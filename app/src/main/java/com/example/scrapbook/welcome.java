package com.example.scrapbook;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Build;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class welcome extends AppCompatActivity {

    Toolbar toolbar;
    ActionMode actionMode;

    Button add;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        toolbar = findViewById(R.id.toolbar);
        add=findViewById(R.id.btnadd);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home Page");


add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(welcome.this,Form2.class));
    }
});
    }


}


