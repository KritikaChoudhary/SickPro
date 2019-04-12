package com.example.nimishbongale.sickpro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button onl=findViewById(R.id.Onli);
        Button offl=findViewById(R.id.Offl);
        Button b1=findViewById(R.id.goto4);
        final Intent implicit=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.netmeds.com"));

        onl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(implicit);
            }
        });
        offl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent explicit=new Intent(MainActivity.this, Pres.class);
                startActivity(explicit);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent explicit=new Intent(MainActivity.this, FourthActivity.class);
                startActivity(explicit);
            }
        });


    }
}

