package com.example.tugassplash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView hello;
    CardView count;
    CardView Sianida;
    CardView twoactivity;
    CardView setalarm;
    CardView maps;
    Uri geoLocation;
    CardView Shopping;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (CardView)findViewById(R.id.to_hello);
        count = (CardView)findViewById(R.id.to_count);
        Sianida = (CardView)findViewById(R.id.to_sianida);
        twoactivity = (CardView)findViewById(R.id.to_twoactivity);
        setalarm = (CardView)findViewById(R.id.to_alarm);
        maps = (CardView) findViewById(R.id.to_maps);
        Shopping = (CardView) findViewById(R.id.to_repository) ;

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity.this, helloactivity.class);
                startActivity(Buka);
            }
        });
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity.this, countactivity.class);
                startActivity(Buka);
            }
        });
        Sianida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity.this, sianidaActivity.class);
                startActivity(Buka);
            }
        });
        twoactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity.this, Twoactivity.class);
                startActivity(Buka);
            }
        });
        setalarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Buka = new Intent(MainActivity.this, Setalarm.class);
                startActivity(Buka);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(geoLocation);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }
            }
        });
    }
}