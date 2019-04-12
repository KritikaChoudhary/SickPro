package com.example.nimishbongale.sickpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);
        b5 = findViewById(R.id.button6);


        /*final Intent explicit2= new Intent(MainActivity.this,.class);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit2);
            }
        });
        final Intent explicit3= new Intent(MainActivity.this,.class);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit3);
            }
        });
        final Intent explicit4= new Intent(MainActivity.this,.class);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit4);
            }
        });
        final Intent explicit5= new Intent(MainActivity.this,.class);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(explicit5);
            }
        });*/
    }
}
