package com.example.myproject2;

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
        Button b7=findViewById(R.id.button7);
        Button b1=findViewById(R.id.bu1);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent explicit=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(explicit);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
    }
}
